import info.stopro.Product

class BootStrap {

    def init = { servletContext ->
      Product p1 =  new Product(name: "Amazon Kindle", price: 49.0D)
      p1.save(true)
    }
    def destroy = {
    }
}
