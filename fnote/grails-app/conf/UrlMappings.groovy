class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.${format})?"{
            constraints {
                // apply constraints here
            }
        }

        // "/"(view:"/index")
	"/"(controller:"quote", action:"index")
        "500"(view:'/error')
	}
}
