package info.stopro

import org.bson.types.ObjectId
import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Person)
class PersonTests {

    void testPersist() {
      mockDomain(Person)
      def s = new Person(id: new ObjectId(), firstName: "richard", lastName: "zhao")
      s.save()

      assert s.id != null

      s = Person.get(s.id)
      assert s!= null
    }

  void tearDown() {
    //    disconnect()
  }
}
