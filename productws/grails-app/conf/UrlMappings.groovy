class UrlMappings {

	static mappings = {
	  //	  "/$controller/$action?/$id?" { }
	  "/product/list" (controller: "product", parseRequest: true) {
	    action = [GET: "list"]}

	  "/product/config" (controller: "product", parseRequest: true) {
	    action = [GET: "config"]}

	  
	  
	  "/product/$id?"(resource: "product", parseRequest: true) {
	    action = [GET: "show", PUT: "update", DELETE: "delete", POST: "save"]
	  }
	  "/"(view:"/index")
		// "500"(view:'/error')
	}
}
