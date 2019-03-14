
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
                            <li """),_display_(/*24.34*/if(pagename== "Login")/*24.56*/{_display_(Seq[Any](format.raw/*24.57*/("""class="active"""")))}),format.raw/*24.72*/(""">
                                """),_display_(/*25.34*/if(emps != null)/*25.50*/ {_display_(Seq[Any](format.raw/*25.52*/("""
                                    """),format.raw/*26.37*/("""<a href=""""),_display_(/*26.47*/routes/*26.53*/.LoginController.logout()),format.raw/*26.78*/("""">Logout</a></li>
                                """)))}/*27.35*/else/*27.40*/{_display_(Seq[Any](format.raw/*27.41*/("""
                                    """),format.raw/*28.37*/("""<a href=""""),_display_(/*28.47*/routes/*28.53*/.LoginController.logout()),format.raw/*28.78*/("""">Login</a></li>
                                """)))}),format.raw/*29.34*/("""
                        """),format.raw/*30.25*/("""</ul>
                    </div>
                </nav>
        """),_display_(/*33.10*/content),format.raw/*33.17*/("""
    """),format.raw/*34.5*/("""</body>
    <script src=""""),_display_(/*35.19*/routes/*35.25*/.Assets.versioned("javascripts/main.js")),format.raw/*35.65*/(""""></script>
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
                  DATE: Thu Mar 14 19:58:17 GMT 2019
                  SOURCE: /home/wdd/SDevProj/SDev_CA1/app/views/main.scala.html
                  HASH: d41fbc4f2dda1a7fb05ce8e88e736d23913f1e22
                  MATRIX: 975->1|1132->65|1203->110|1231->118|1806->666|1821->672|1865->695|2018->821|2048->842|2087->843|2133->858|2171->869|2186->875|2231->898|2307->947|2341->972|2380->973|2426->988|2464->999|2479->1005|2531->1035|2616->1093|2647->1115|2686->1116|2732->1131|2794->1166|2819->1182|2859->1184|2924->1221|2961->1231|2976->1237|3022->1262|3092->1314|3105->1319|3144->1320|3209->1357|3246->1367|3261->1373|3307->1398|3388->1448|3441->1473|3533->1538|3561->1545|3593->1550|3646->1576|3661->1582|3722->1622
                  LINES: 28->1|33->2|36->5|36->5|50->19|50->19|50->19|53->22|53->22|53->22|53->22|53->22|53->22|53->22|54->23|54->23|54->23|54->23|54->23|54->23|54->23|55->24|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|59->28|60->29|61->30|64->33|64->33|65->34|66->35|66->35|66->35
                  -- GENERATED --
              */
          