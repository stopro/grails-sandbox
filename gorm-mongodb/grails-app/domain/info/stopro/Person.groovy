package info.stopro

import org.bson.types.ObjectId

class Person {
  ObjectId id
  String firstName
  String lastName

  List<String> friends
  Map pets
  
    static constraints = {
    }
}
