import org.bson.types.ObjectId
import info.stopro.Person

class BootStrap {

    def init = { servletContext ->
      def s = new Person(id: new ObjectId(), firstName: "richard", lastName: "zhao")
      s.save(true)

    }
    def destroy = {
    }
}
