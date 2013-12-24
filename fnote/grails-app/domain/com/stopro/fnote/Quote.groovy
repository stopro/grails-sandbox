package com.stopro.fnote

class Quote {

  String authorName
  String sentence
  String bookName
  Date publishDate
  
    static constraints = {
      authorName blank: false, nullable: false
      sentence blank: false, nullable: false
      bookName blank: true, nullable: true
      publishDate max: new Date(), nullable: true
    }
}
