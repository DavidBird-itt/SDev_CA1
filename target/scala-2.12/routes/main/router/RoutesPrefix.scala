// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Desktop/SDev_CA1/conf/routes
// @DATE:Sun Mar 17 12:16:50 GMT 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
