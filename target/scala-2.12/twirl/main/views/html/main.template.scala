
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
                            <li """),_display_(/*24.34*/if(pagename== "Database")/*24.59*/{_display_(Seq[Any](format.raw/*24.60*/("""class="active"""")))}),format.raw/*24.75*/("""><a href=""""),_display_(/*24.86*/routes/*24.92*/.HomeController.databaseTest()),format.raw/*24.122*/("""">Database Test</a></li>
                            <li """),_display_(/*25.34*/if(pagename== "Employees")/*25.60*/{_display_(Seq[Any](format.raw/*25.61*/("""class="active"""")))}),format.raw/*25.76*/("""><a href=""""),_display_(/*25.87*/routes/*25.93*/.HomeController.employees()),format.raw/*25.120*/("""">Employees</a></li>
                            <li """),_display_(/*26.34*/if(pagename== "Login")/*26.56*/{_display_(Seq[Any](format.raw/*26.57*/("""class="active"""")))}),format.raw/*26.72*/("""><a href=""""),_display_(/*26.83*/routes/*26.89*/.LoginController.logout()),format.raw/*26.114*/("""">Logout</a></li>  
                            """)))}),format.raw/*27.30*/("""
                        """),format.raw/*28.25*/("""</ul>
                    </div>
                </nav>
        """),_display_(/*31.10*/content),format.raw/*31.17*/("""
    """),format.raw/*32.5*/("""</body>
    <script src=""""),_display_(/*33.19*/routes/*33.25*/.Assets.versioned("javascripts/main.js")),format.raw/*33.65*/(""""></script>
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
                  DATE: Mon Mar 18 16:33:41 GMT 2019
                  SOURCE: /home/wdd/Desktop/SDev_CA1/app/views/main.scala.html
                  HASH: 10f408e0dac611b80f6059e18329926837734d71
                  MATRIX: 975->1|1132->65|1203->110|1231->118|1806->666|1821->672|1865->695|2014->817|2039->833|2079->835|2136->864|2168->869|2198->890|2237->891|2283->906|2321->917|2336->923|2381->946|2457->995|2491->1020|2530->1021|2576->1036|2614->1047|2629->1053|2681->1083|2766->1141|2801->1167|2840->1168|2886->1183|2924->1194|2939->1200|2988->1227|3069->1281|3100->1303|3139->1304|3185->1319|3223->1330|3238->1336|3285->1361|3365->1410|3418->1435|3510->1500|3538->1507|3570->1512|3623->1538|3638->1544|3699->1584
                  LINES: 28->1|33->2|36->5|36->5|50->19|50->19|50->19|53->22|53->22|53->22|54->23|54->23|54->23|54->23|54->23|54->23|54->23|54->23|55->24|55->24|55->24|55->24|55->24|55->24|55->24|56->25|56->25|56->25|56->25|56->25|56->25|56->25|57->26|57->26|57->26|57->26|57->26|57->26|57->26|58->27|59->28|62->31|62->31|63->32|64->33|64->33|64->33
                  -- GENERATED --
              */
          