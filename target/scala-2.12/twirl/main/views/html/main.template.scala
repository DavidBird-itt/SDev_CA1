
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.Employees,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pagename: String, emps: models.users.Employees)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>
	<head>
		<title>EMP """),_display_(/*5.15*/pagename),format.raw/*5.23*/("""</title>
		
		<meta name="viewport" content="width=device-width, initial-scale=1">
		
		<style>

		</style>
		
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	</head>
	<body>
            <nav class="navbar navbar-inverse">
                    <div class="container-fluid">
                        <div class="navbar-header">
                            <a class="navbar-brand" href=""""),_display_(/*19.60*/routes/*19.66*/.HomeController.index()),format.raw/*19.89*/("""">CA1</a>
                        </div>
                        <ul class="nav navbar-nav">
                            """),_display_(/*22.30*/if(emps != null)/*22.46*/ {_display_(Seq[Any](format.raw/*22.48*/("""
                            """),format.raw/*23.29*/("""<li """),_display_(/*23.34*/if(pagename== "Home")/*23.55*/{_display_(Seq[Any](format.raw/*23.56*/("""class="active"""")))}),format.raw/*23.71*/("""><a href=""""),_display_(/*23.82*/routes/*23.88*/.HomeController.index()),format.raw/*23.111*/("""">Home</a></li>
                            """),_display_(/*24.30*/if("Manager".equals(emps.getRole()))/*24.66*/{_display_(Seq[Any](format.raw/*24.67*/("""
                            """),format.raw/*25.29*/("""<li """),_display_(/*25.34*/if(pagename== "Database")/*25.59*/{_display_(Seq[Any](format.raw/*25.60*/("""class="active"""")))}),format.raw/*25.75*/("""><a href=""""),_display_(/*25.86*/routes/*25.92*/.HomeController.databaseTest()),format.raw/*25.122*/("""">Database Test</a></li>
                            <li """),_display_(/*26.34*/if(pagename== "Employees")/*26.60*/{_display_(Seq[Any](format.raw/*26.61*/("""class="active"""")))}),format.raw/*26.76*/("""><a href=""""),_display_(/*26.87*/routes/*26.93*/.HomeController.employees()),format.raw/*26.120*/("""">Employees</a></li>
                            <li """),_display_(/*27.34*/if(pagename== "Raise")/*27.56*/{_display_(Seq[Any](format.raw/*27.57*/("""class="active"""")))}),format.raw/*27.72*/("""><a href=""""),_display_(/*27.83*/routes/*27.89*/.HomeController.giveRaise()),format.raw/*27.116*/("""">Raise</a></li>
                        """)))}),format.raw/*28.26*/("""
                        """),format.raw/*29.25*/("""<li """),_display_(/*29.30*/if(pagename== "Contact")/*29.54*/{_display_(Seq[Any](format.raw/*29.55*/("""class="active"""")))}),format.raw/*29.70*/("""><a href=""""),_display_(/*29.81*/routes/*29.87*/.HomeController.managerContact()),format.raw/*29.119*/("""">Contact</a></li>

                            
                            <li """),_display_(/*32.34*/if(pagename== "Login")/*32.56*/{_display_(Seq[Any](format.raw/*32.57*/("""class="active"""")))}),format.raw/*32.72*/("""><a href=""""),_display_(/*32.83*/routes/*32.89*/.LoginController.logout()),format.raw/*32.114*/("""">Logout</a></li>  
                            """)))}),format.raw/*33.30*/("""
                        """),format.raw/*34.25*/("""</ul>
                    </div>
                </nav>
        """),_display_(/*37.10*/content),format.raw/*37.17*/("""
    """),format.raw/*38.5*/("""</body>
    <script src=""""),_display_(/*39.19*/routes/*39.25*/.Assets.versioned("javascripts/main.js")),format.raw/*39.65*/(""""></script>
</html>"""))
      }
    }
  }

  def render(pagename:String,emps:models.users.Employees,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(pagename,emps)(content)

  def f:((String,models.users.Employees) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (pagename,emps) => (content) => apply(pagename,emps)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 18:18:33 GMT 2019
                  SOURCE: /home/wdd/SDevProj/SDev_CA1/app/views/main.scala.html
                  HASH: bd3b6e831abdcf61ff41c775b588de706d34bb31
                  MATRIX: 975->1|1132->65|1203->110|1231->118|1806->666|1821->672|1865->695|2014->817|2039->833|2079->835|2136->864|2168->869|2198->890|2237->891|2283->906|2321->917|2336->923|2381->946|2453->991|2498->1027|2537->1028|2594->1057|2626->1062|2660->1087|2699->1088|2745->1103|2783->1114|2798->1120|2850->1150|2935->1208|2970->1234|3009->1235|3055->1250|3093->1261|3108->1267|3157->1294|3238->1348|3269->1370|3308->1371|3354->1386|3392->1397|3407->1403|3456->1430|3529->1472|3582->1497|3614->1502|3647->1526|3686->1527|3732->1542|3770->1553|3785->1559|3839->1591|3948->1673|3979->1695|4018->1696|4064->1711|4102->1722|4117->1728|4164->1753|4244->1802|4297->1827|4389->1892|4417->1899|4449->1904|4502->1930|4517->1936|4578->1976
                  LINES: 28->1|33->2|36->5|36->5|50->19|50->19|50->19|53->22|53->22|53->22|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|56->25|56->25|56->25|56->25|56->25|57->26|57->26|57->26|57->26|57->26|57->26|57->26|58->27|58->27|58->27|58->27|58->27|58->27|58->27|59->28|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|63->32|63->32|63->32|63->32|63->32|63->32|63->32|64->33|65->34|68->37|68->37|69->38|70->39|70->39|70->39
                  -- GENERATED --
              */
          