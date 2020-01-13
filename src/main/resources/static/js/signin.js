zEmbedded.load('embeddedZK', '/signin');
window.addEventListener('load', function(){
	var vm = new Vue({
	  el: '#user-signin',
	  data: {
		account: '',
		password: '',
	  },
	  methods: {
		signin () {
			var self = this;
			console.log('acc: ' + self.account + ', pwd: '+ self.password);
			zkbind.$('$signin-binder').after('toC_LoginMessage', function (data) {
				alert(data);
			});
			zkbind.$('$signin-binder').command('signIn', {account: self.account, password: self.password});
		}
	  }
	});
});