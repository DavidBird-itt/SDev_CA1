// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/SDevProj/SDev_CA1/conf/routes
// @DATE:Mon Mar 18 20:33:26 GMT 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_1: controllers.HomeController,
  // @LINE:9
  CountController_0: controllers.CountController,
  // @LINE:11
  AsyncController_2: controllers.AsyncController,
  // @LINE:15
  Assets_3: controllers.Assets,
  // @LINE:20
  LoginController_4: controllers.LoginController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:9
    CountController_0: controllers.CountController,
    // @LINE:11
    AsyncController_2: controllers.AsyncController,
    // @LINE:15
    Assets_3: controllers.Assets,
    // @LINE:20
    LoginController_4: controllers.LoginController
  ) = this(errorHandler, HomeController_1, CountController_0, AsyncController_2, Assets_3, LoginController_4, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, CountController_0, AsyncController_2, Assets_3, LoginController_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """databaseTest""", """controllers.HomeController.databaseTest"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginSubmit""", """controllers.LoginController.loginSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.LoginController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """managerContact""", """controllers.HomeController.managerContact"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """giveRaise""", """controllers.HomeController.giveRaise"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """raiseSubmit/""" + "$" + """id<[^/]+>""", """controllers.HomeController.raiseSubmit(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """employees""", """controllers.HomeController.employees"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addManager""", """controllers.HomeController.addManager"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addManagerSubmit""", """controllers.HomeController.addManagerSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateManager/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateManager(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteManager/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteManager(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addWorker""", """controllers.HomeController.addWorker"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addWorkerSubmit""", """controllers.HomeController.addWorkerSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateWorker/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateWorker(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteWorker/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteWorker(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addProject""", """controllers.HomeController.addProject"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addProjectSubmit""", """controllers.HomeController.addProjectSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateProject/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateProject(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteProject/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteProject(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addDepartment""", """controllers.HomeController.addDepartment"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addDepartmentSubmit""", """controllers.HomeController.addDepartmentSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateDepartment/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateDepartment(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteDepartment/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteDepartment(id:Long)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_CountController_count1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count1_invoker = createInvoker(
    CountController_0.count,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      this.prefix + """count""",
      """ An example controller showing how to use dependency injection""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_AsyncController_message2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message2_invoker = createInvoker(
    AsyncController_2.message,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      this.prefix + """message""",
      """ An example controller showing how to write asynchronous code""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    Assets_3.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_databaseTest4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("databaseTest")))
  )
  private[this] lazy val controllers_HomeController_databaseTest4_invoker = createInvoker(
    HomeController_1.databaseTest,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "databaseTest",
      Nil,
      "GET",
      this.prefix + """databaseTest""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_LoginController_login5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login5_invoker = createInvoker(
    LoginController_4.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """GET from LoginController""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_LoginController_loginSubmit6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginSubmit")))
  )
  private[this] lazy val controllers_LoginController_loginSubmit6_invoker = createInvoker(
    LoginController_4.loginSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "loginSubmit",
      Nil,
      "GET",
      this.prefix + """loginSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_LoginController_logout7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_LoginController_logout7_invoker = createInvoker(
    LoginController_4.logout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_HomeController_managerContact8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("managerContact")))
  )
  private[this] lazy val controllers_HomeController_managerContact8_invoker = createInvoker(
    HomeController_1.managerContact,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "managerContact",
      Nil,
      "GET",
      this.prefix + """managerContact""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_HomeController_giveRaise9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("giveRaise")))
  )
  private[this] lazy val controllers_HomeController_giveRaise9_invoker = createInvoker(
    HomeController_1.giveRaise,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "giveRaise",
      Nil,
      "GET",
      this.prefix + """giveRaise""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_HomeController_raiseSubmit10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("raiseSubmit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_raiseSubmit10_invoker = createInvoker(
    HomeController_1.raiseSubmit(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "raiseSubmit",
      Seq(classOf[String]),
      "GET",
      this.prefix + """raiseSubmit/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_HomeController_employees11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("employees")))
  )
  private[this] lazy val controllers_HomeController_employees11_invoker = createInvoker(
    HomeController_1.employees,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "employees",
      Nil,
      "GET",
      this.prefix + """employees""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_HomeController_addManager12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addManager")))
  )
  private[this] lazy val controllers_HomeController_addManager12_invoker = createInvoker(
    HomeController_1.addManager,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addManager",
      Nil,
      "GET",
      this.prefix + """addManager""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_HomeController_addManagerSubmit13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addManagerSubmit")))
  )
  private[this] lazy val controllers_HomeController_addManagerSubmit13_invoker = createInvoker(
    HomeController_1.addManagerSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addManagerSubmit",
      Nil,
      "POST",
      this.prefix + """addManagerSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_HomeController_updateManager14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateManager/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateManager14_invoker = createInvoker(
    HomeController_1.updateManager(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateManager",
      Seq(classOf[String]),
      "GET",
      this.prefix + """updateManager/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_HomeController_deleteManager15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteManager/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteManager15_invoker = createInvoker(
    HomeController_1.deleteManager(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteManager",
      Seq(classOf[String]),
      "GET",
      this.prefix + """deleteManager/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_HomeController_addWorker16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addWorker")))
  )
  private[this] lazy val controllers_HomeController_addWorker16_invoker = createInvoker(
    HomeController_1.addWorker,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addWorker",
      Nil,
      "GET",
      this.prefix + """addWorker""",
      """""",
      Seq()
    )
  )

  // @LINE:38
  private[this] lazy val controllers_HomeController_addWorkerSubmit17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addWorkerSubmit")))
  )
  private[this] lazy val controllers_HomeController_addWorkerSubmit17_invoker = createInvoker(
    HomeController_1.addWorkerSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addWorkerSubmit",
      Nil,
      "POST",
      this.prefix + """addWorkerSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:39
  private[this] lazy val controllers_HomeController_updateWorker18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateWorker/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateWorker18_invoker = createInvoker(
    HomeController_1.updateWorker(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateWorker",
      Seq(classOf[String]),
      "GET",
      this.prefix + """updateWorker/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:40
  private[this] lazy val controllers_HomeController_deleteWorker19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteWorker/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteWorker19_invoker = createInvoker(
    HomeController_1.deleteWorker(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteWorker",
      Seq(classOf[String]),
      "GET",
      this.prefix + """deleteWorker/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:42
  private[this] lazy val controllers_HomeController_addProject20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addProject")))
  )
  private[this] lazy val controllers_HomeController_addProject20_invoker = createInvoker(
    HomeController_1.addProject,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addProject",
      Nil,
      "GET",
      this.prefix + """addProject""",
      """""",
      Seq()
    )
  )

  // @LINE:43
  private[this] lazy val controllers_HomeController_addProjectSubmit21_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addProjectSubmit")))
  )
  private[this] lazy val controllers_HomeController_addProjectSubmit21_invoker = createInvoker(
    HomeController_1.addProjectSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addProjectSubmit",
      Nil,
      "POST",
      this.prefix + """addProjectSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:44
  private[this] lazy val controllers_HomeController_updateProject22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateProject/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateProject22_invoker = createInvoker(
    HomeController_1.updateProject(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateProject",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """updateProject/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:45
  private[this] lazy val controllers_HomeController_deleteProject23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteProject/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteProject23_invoker = createInvoker(
    HomeController_1.deleteProject(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteProject",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """deleteProject/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:47
  private[this] lazy val controllers_HomeController_addDepartment24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addDepartment")))
  )
  private[this] lazy val controllers_HomeController_addDepartment24_invoker = createInvoker(
    HomeController_1.addDepartment,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addDepartment",
      Nil,
      "GET",
      this.prefix + """addDepartment""",
      """""",
      Seq()
    )
  )

  // @LINE:48
  private[this] lazy val controllers_HomeController_addDepartmentSubmit25_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addDepartmentSubmit")))
  )
  private[this] lazy val controllers_HomeController_addDepartmentSubmit25_invoker = createInvoker(
    HomeController_1.addDepartmentSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addDepartmentSubmit",
      Nil,
      "POST",
      this.prefix + """addDepartmentSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:49
  private[this] lazy val controllers_HomeController_updateDepartment26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateDepartment/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateDepartment26_invoker = createInvoker(
    HomeController_1.updateDepartment(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateDepartment",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """updateDepartment/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:50
  private[this] lazy val controllers_HomeController_deleteDepartment27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteDepartment/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteDepartment27_invoker = createInvoker(
    HomeController_1.deleteDepartment(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteDepartment",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """deleteDepartment/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index())
      }
  
    // @LINE:9
    case controllers_CountController_count1_route(params@_) =>
      call { 
        controllers_CountController_count1_invoker.call(CountController_0.count)
      }
  
    // @LINE:11
    case controllers_AsyncController_message2_route(params@_) =>
      call { 
        controllers_AsyncController_message2_invoker.call(AsyncController_2.message)
      }
  
    // @LINE:15
    case controllers_Assets_versioned3_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned3_invoker.call(Assets_3.versioned(path, file))
      }
  
    // @LINE:17
    case controllers_HomeController_databaseTest4_route(params@_) =>
      call { 
        controllers_HomeController_databaseTest4_invoker.call(HomeController_1.databaseTest)
      }
  
    // @LINE:20
    case controllers_LoginController_login5_route(params@_) =>
      call { 
        controllers_LoginController_login5_invoker.call(LoginController_4.login)
      }
  
    // @LINE:21
    case controllers_LoginController_loginSubmit6_route(params@_) =>
      call { 
        controllers_LoginController_loginSubmit6_invoker.call(LoginController_4.loginSubmit)
      }
  
    // @LINE:22
    case controllers_LoginController_logout7_route(params@_) =>
      call { 
        controllers_LoginController_logout7_invoker.call(LoginController_4.logout)
      }
  
    // @LINE:24
    case controllers_HomeController_managerContact8_route(params@_) =>
      call { 
        controllers_HomeController_managerContact8_invoker.call(HomeController_1.managerContact)
      }
  
    // @LINE:25
    case controllers_HomeController_giveRaise9_route(params@_) =>
      call { 
        controllers_HomeController_giveRaise9_invoker.call(HomeController_1.giveRaise)
      }
  
    // @LINE:26
    case controllers_HomeController_raiseSubmit10_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_HomeController_raiseSubmit10_invoker.call(HomeController_1.raiseSubmit(id))
      }
  
    // @LINE:28
    case controllers_HomeController_employees11_route(params@_) =>
      call { 
        controllers_HomeController_employees11_invoker.call(HomeController_1.employees)
      }
  
    // @LINE:32
    case controllers_HomeController_addManager12_route(params@_) =>
      call { 
        controllers_HomeController_addManager12_invoker.call(HomeController_1.addManager)
      }
  
    // @LINE:33
    case controllers_HomeController_addManagerSubmit13_route(params@_) =>
      call { 
        controllers_HomeController_addManagerSubmit13_invoker.call(HomeController_1.addManagerSubmit)
      }
  
    // @LINE:34
    case controllers_HomeController_updateManager14_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_HomeController_updateManager14_invoker.call(HomeController_1.updateManager(id))
      }
  
    // @LINE:35
    case controllers_HomeController_deleteManager15_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_HomeController_deleteManager15_invoker.call(HomeController_1.deleteManager(id))
      }
  
    // @LINE:37
    case controllers_HomeController_addWorker16_route(params@_) =>
      call { 
        controllers_HomeController_addWorker16_invoker.call(HomeController_1.addWorker)
      }
  
    // @LINE:38
    case controllers_HomeController_addWorkerSubmit17_route(params@_) =>
      call { 
        controllers_HomeController_addWorkerSubmit17_invoker.call(HomeController_1.addWorkerSubmit)
      }
  
    // @LINE:39
    case controllers_HomeController_updateWorker18_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_HomeController_updateWorker18_invoker.call(HomeController_1.updateWorker(id))
      }
  
    // @LINE:40
    case controllers_HomeController_deleteWorker19_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_HomeController_deleteWorker19_invoker.call(HomeController_1.deleteWorker(id))
      }
  
    // @LINE:42
    case controllers_HomeController_addProject20_route(params@_) =>
      call { 
        controllers_HomeController_addProject20_invoker.call(HomeController_1.addProject)
      }
  
    // @LINE:43
    case controllers_HomeController_addProjectSubmit21_route(params@_) =>
      call { 
        controllers_HomeController_addProjectSubmit21_invoker.call(HomeController_1.addProjectSubmit)
      }
  
    // @LINE:44
    case controllers_HomeController_updateProject22_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateProject22_invoker.call(HomeController_1.updateProject(id))
      }
  
    // @LINE:45
    case controllers_HomeController_deleteProject23_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_deleteProject23_invoker.call(HomeController_1.deleteProject(id))
      }
  
    // @LINE:47
    case controllers_HomeController_addDepartment24_route(params@_) =>
      call { 
        controllers_HomeController_addDepartment24_invoker.call(HomeController_1.addDepartment)
      }
  
    // @LINE:48
    case controllers_HomeController_addDepartmentSubmit25_route(params@_) =>
      call { 
        controllers_HomeController_addDepartmentSubmit25_invoker.call(HomeController_1.addDepartmentSubmit)
      }
  
    // @LINE:49
    case controllers_HomeController_updateDepartment26_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateDepartment26_invoker.call(HomeController_1.updateDepartment(id))
      }
  
    // @LINE:50
    case controllers_HomeController_deleteDepartment27_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_deleteDepartment27_invoker.call(HomeController_1.deleteDepartment(id))
      }
  }
}
