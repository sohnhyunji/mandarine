var app = new Vue({
  el: '#app',
  data: {
    message: '안녕하세요 Vue!'
  },
  created: function () {
	  this.getFileBrowser();
  },
  mounted: function () {
	  
  },
  methods: {
	  test : function(event) {
		  alert('test > '+event.target.tagName);
	  },
	  getFileBrowser : function(){
		  axios({
			  method:'get',
			  url:'/fileBrowser.do'
			})
			  .then(function(response) {
			  console.log(response.data.viewDirectoryList);
			  console.log(response.data.viewFileList);
			});
	  }
  }
  
});