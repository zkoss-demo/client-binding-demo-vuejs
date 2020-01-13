zEmbedded.load('embeddedZK', '/articles');
window.addEventListener('load', function(){
	zk.afterMount(function () {
        //articles
        Vue.component('article-block', {
          template:  `
            <div class="col-md-4">
    			<div class="card mb-4 box-shadow">
    				<img class="card-img-top"
    					 data-src="holder.js/100px225?theme=thumb&amp;bg=55595c&amp;fg=eceeef&amp;text=Thumbnail"
    					 alt="Thumbnail [100%x225]" style="height: 225px; width: 100%; display: block;"
    					 v-bind:src="thumbnail"
    					 data-holder-rendered="true">
    				<div class="card-body">
    					<p class="card-text">{{subject}}</p>
    					<p><small class="text-muted">{{username}}</small></p>
    					<div class="d-flex justify-content-between align-items-center">
    						<div class="btn-group">
    							<button v-on:click="$emit(\'view\')" type="button" class="btn btn-sm btn-outline-secondary">View</button>
    						</div>
    						<small class="text-muted">{{time}}</small>
    					</div>
    				</div>
    			</div>
    		</div>
            `,
          props: ['uid', 'subject', 'thumbnail', 'username', 'time']
        });
        var articlesBinder = zkbind.$('$articles-binder');
        new Vue({
          el: '#articles',
          data: {
            articles: []
          },
          beforeMount() {
			  this.loadArticles();
		  },
			methods: {
			  loadArticles () {
				var self = this;
				articlesBinder.after('toC_Articles', function (data) {
					self.articles = data;
				});
				articlesBinder.command('loadArticles');
			  },
			  view(uid) {
			  	articlesBinder.command('loadArticleById', {aid: uid});
			  }
			}
        });

        //article-view
    });
});
