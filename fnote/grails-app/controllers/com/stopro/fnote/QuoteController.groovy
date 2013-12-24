package com.stopro.fnote

class QuoteController {

  def random = new Random()
  
  def index() {
    int total = Quote.count()
    int idx = random.nextInt(total)
    def map = [quote: Quote.get(idx + 1)]
    render(view: "/home", model: map)
  }

  def random() {
    int total = Quote.count()
    int idx = random.nextInt(total)
    render Quote.get(idx + 1).sentence + " -- " + Quote.get(idx + 1).authorName
  } 
}
