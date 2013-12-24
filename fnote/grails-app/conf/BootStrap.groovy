import com.stopro.fnote.Quote

class BootStrap {

    def init = { servletContext ->
      Quote q1 = new Quote(authorName:"Aristotle",sentence:"Love is composed of a single soul inhabiting two bodies.").save(flush:true)
      Quote q2 = new Quote(authorName:"George Washington", sentence:"Be courteous to all, but intimate with few, and let those few be well tried before you give them your confidence.").save(flush:true)
      Quote q3 = new Quote(authorName:"Olivia Wilde", sentence: "But even if I'm left high and dry at the end of this wild journey, just taking it is a great feeling.").save(flush:true)
      Quote q4 = new Quote(authorName:"Albert Einstein", sentence: "Two things are infinite: the universe and human stupidity; and I'm not sure about the universe.").save(flush:true)
      Quote q5 = new Quote(authorName:"Steve Jobs", sentence: "Your time is limited, so don't waste it living someone else's life.").save(flush:true)
    }
    def destroy = {
    }
}
