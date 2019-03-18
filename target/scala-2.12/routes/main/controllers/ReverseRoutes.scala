// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/SDevProj/SDev_CA1/conf/routes
// @DATE:Mon Mar 18 18:01:56 GMT 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:15
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:9
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def count(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def updateManager(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateManager/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:40
    def addProject(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addProject")
    }
  
    // @LINE:24
    def managerContact(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "managerContact")
    }
  
    // @LINE:36
    def addWorkerSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addWorkerSubmit")
    }
  
    // @LINE:33
    def deleteManager(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteManager/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:43
    def deleteProject(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteProject/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:35
    def addWorker(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addWorker")
    }
  
    // @LINE:42
    def updateProject(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateProject/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:30
    def addManager(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addManager")
    }
  
    // @LINE:25
    def giveRaise(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "giveRaise")
    }
  
    // @LINE:46
    def addDepartmentSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addDepartmentSubmit")
    }
  
    // @LINE:17
    def databaseTest(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "databaseTest")
    }
  
    // @LINE:48
    def deleteDepartment(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteDepartment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:26
    def employees(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "employees")
    }
  
    // @LINE:37
    def updateWorker(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "updateWorker/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
    // @LINE:31
    def addManagerSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addManagerSubmit")
    }
  
    // @LINE:41
    def addProjectSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addProjectSubmit")
    }
  
    // @LINE:45
    def addDepartment(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addDepartment")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:38
    def deleteWorker(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "deleteWorker/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
  }

  // @LINE:11
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def message(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

  // @LINE:20
  class ReverseLoginController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def loginSubmit(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "loginSubmit")
    }
  
    // @LINE:22
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:20
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }


}
