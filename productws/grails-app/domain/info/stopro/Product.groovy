package info.stopro

class Product {

  String name
  Double price
  
    static constraints = {
      price(min: 1d, max:50d)
    }
}
