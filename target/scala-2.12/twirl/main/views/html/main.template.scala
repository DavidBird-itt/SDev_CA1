
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
                            <li """),_display_(/*22.34*/if(pagename== "Home")/*22.55*/{_display_(Seq[Any](format.raw/*22.56*/("""class="active"""")))}),format.raw/*22.71*/("""><a href=""""),_display_(/*22.82*/routes/*22.88*/.HomeController.index()),format.raw/*22.111*/("""">Home</a></li>
                            <li """),_display_(/*23.34*/if(pagename== "Database")/*23.59*/{_display_(Seq[Any](format.raw/*23.60*/("""class="active"""")))}),format.raw/*23.75*/("""><a href=""""),_display_(/*23.86*/routes/*23.92*/.HomeController.databaseTest()),format.raw/*23.122*/("""">Database Test</a></li>
                            <li """),_display_(/*24.34*/if(pagename== "Employees")/*24.60*/{_display_(Seq[Any](format.raw/*24.61*/("""class="active"""")))}),format.raw/*24.76*/("""><a href=""""),_display_(/*24.87*/routes/*24.93*/.HomeController.employees()),format.raw/*24.120*/("""">Employees</a></li>
                            <li """),_display_(/*25.34*/if(pagename== "Login")/*25.56*/{_display_(Seq[Any](format.raw/*25.57*/("""class="active"""")))}),format.raw/*25.72*/(""">
                                """),_display_(/*26.34*/if(emps != null)/*26.50*/ {_display_(Seq[Any](format.raw/*26.52*/("""
                                    """),format.raw/*27.37*/("""<a href=""""),_display_(/*27.47*/routes/*27.53*/.LoginController.logout()),format.raw/*27.78*/("""">Logout</a></li>
                                """)))}/*28.35*/else/*28.40*/{_display_(Seq[Any](format.raw/*28.41*/("""
                                    """),format.raw/*29.37*/("""<a href=""""),_display_(/*29.47*/routes/*29.53*/.LoginController.logout()),format.raw/*29.78*/("""">Login</a></li>
                                """)))}),format.raw/*30.34*/("""
                        """),format.raw/*31.25*/("""</ul>
                    </div>
                </nav>
        """),_display_(/*34.10*/content),format.raw/*34.17*/("""
    """),format.raw/*35.5*/("""</body>
    <script src=""""),_display_(/*36.19*/routes/*36.25*/.Assets.versioned("javascripts/main.js")),format.raw/*36.65*/(""""></script>
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
                  DATE: Thu Mar 14 21:38:35 GMT 2019
                  SOURCE: /home/wdd/SDevProj/SDev_CA1/app/views/main.scala.html
                  HASH: 7f90e7e310b26fd2b8eb49d557aa30b9f63f62a4
                  MATRIX: 975->1|1132->65|1203->110|1231->118|1806->666|1821->672|1865->695|2018->821|2048->842|2087->843|2133->858|2171->869|2186->875|2231->898|2307->947|2341->972|2380->973|2426->988|2464->999|2479->1005|2531->1035|2616->1093|2651->1119|2690->1120|2736->1135|2774->1146|2789->1152|2838->1179|2919->1233|2950->1255|2989->1256|3035->1271|3097->1306|3122->1322|3162->1324|3227->1361|3264->1371|3279->1377|3325->1402|3395->1454|3408->1459|3447->1460|3512->1497|3549->1507|3564->1513|3610->1538|3691->1588|3744->1613|3836->1678|3864->1685|3896->1690|3949->1716|3964->1722|4025->1762
                  LINES: 28->1|33->2|36->5|36->5|50->19|50->19|50->19|53->22|53->22|53->22|53->22|53->22|53->22|53->22|54->23|54->23|54->23|54->23|54->23|54->23|54->23|55->24|55->24|55->24|55->24|55->24|55->24|55->24|56->25|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|58->27|59->28|59->28|59->28|60->29|60->29|60->29|60->29|61->30|62->31|65->34|65->34|66->35|67->36|67->36|67->36
                  -- GENERATED --
              */
          