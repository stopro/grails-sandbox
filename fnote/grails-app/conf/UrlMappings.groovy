class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.${format})?"{
            constraints {
                // apply constraints here
            }
        }

        // "/"(view:"/index")
	"/"(view:"/home")
        "500"(view:'/error')
	}
}
