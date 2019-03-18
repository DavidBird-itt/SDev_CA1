
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
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<style>
		</style>
		
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	</head>
	<body>
            <nav class="navbar navbar-inverse">
                    <div class="container-fluid">
                        <div class="navbar-header">
                            <a class="navbar-brand" href=""""),_display_(/*18.60*/routes/*18.66*/.HomeController.index()),format.raw/*18.89*/("""">CA1</a>
                        </div>
                        <ul class="nav navbar-nav">
                            """),_display_(/*21.30*/if(emps != null)/*21.46*/ {_display_(Seq[Any](format.raw/*21.48*/("""
                            """),format.raw/*22.29*/("""<li """),_display_(/*22.34*/if(pagename== "Home")/*22.55*/{_display_(Seq[Any](format.raw/*22.56*/("""class="active"""")))}),format.raw/*22.71*/("""><a href=""""),_display_(/*22.82*/routes/*22.88*/.HomeController.index()),format.raw/*22.111*/("""">Home</a></li>
                            <li """),_display_(/*23.34*/if(pagename== "Projects")/*23.59*/{_display_(Seq[Any](format.raw/*23.60*/("""class="active"""")))}),format.raw/*23.75*/("""><a href=""""),_display_(/*23.86*/routes/*23.92*/.HomeController.databaseTest()),format.raw/*23.122*/("""">Projects</a></li>
                            <li """),_display_(/*24.34*/if(pagename== "Contact")/*24.58*/{_display_(Seq[Any](format.raw/*24.59*/("""class="active"""")))}),format.raw/*24.74*/("""><a href=""""),_display_(/*24.85*/routes/*24.91*/.HomeController.managerContact()),format.raw/*24.123*/("""">Contact</a></li>
                            """),_display_(/*25.30*/if("Manager".equals(emps.getRole()))/*25.66*/{_display_(Seq[Any](format.raw/*25.67*/("""
                                """),format.raw/*26.33*/("""<li """),_display_(/*26.38*/if(pagename== "Employees")/*26.64*/{_display_(Seq[Any](format.raw/*26.65*/("""class="active"""")))}),format.raw/*26.80*/("""><a href=""""),_display_(/*26.91*/routes/*26.97*/.HomeController.employees()),format.raw/*26.124*/("""">Employees</a></li>
                                <li """),_display_(/*27.38*/if(pagename== "Raise")/*27.60*/{_display_(Seq[Any](format.raw/*27.61*/("""class="active"""")))}),format.raw/*27.76*/("""><a href=""""),_display_(/*27.87*/routes/*27.93*/.HomeController.giveRaise()),format.raw/*27.120*/("""">Raise</a></li>
                            """)))}),format.raw/*28.30*/("""
                            
                            """),format.raw/*30.29*/("""<li """),_display_(/*30.34*/if(pagename== "Login")/*30.56*/{_display_(Seq[Any](format.raw/*30.57*/("""class="active"""")))}),format.raw/*30.72*/("""><a href=""""),_display_(/*30.83*/routes/*30.89*/.LoginController.logout()),format.raw/*30.114*/("""">Logout</a></li>  
                            """)))}),format.raw/*31.30*/("""
                        """),format.raw/*32.25*/("""</ul>
                    </div>
                </nav>
        """),_display_(/*35.10*/content),format.raw/*35.17*/("""
        
    """),format.raw/*37.5*/("""</body>

    
    <script src=""""),_display_(/*40.19*/routes/*40.25*/.Assets.versioned("javascripts/main.js")),format.raw/*40.65*/(""""></script>
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
                  DATE: Mon Mar 18 21:13:17 GMT 2019
                  SOURCE: /home/wdd/SDevProj/SDev_CA1/app/views/main.scala.html
                  HASH: 578386df1dfacd90c5e213a6531fd786fbc73fff
                  MATRIX: 975->1|1132->65|1203->110|1231->118|1905->765|1920->771|1964->794|2113->916|2138->932|2178->934|2235->963|2267->968|2297->989|2336->990|2382->1005|2420->1016|2435->1022|2480->1045|2556->1094|2590->1119|2629->1120|2675->1135|2713->1146|2728->1152|2780->1182|2860->1235|2893->1259|2932->1260|2978->1275|3016->1286|3031->1292|3085->1324|3160->1372|3205->1408|3244->1409|3305->1442|3337->1447|3372->1473|3411->1474|3457->1489|3495->1500|3510->1506|3559->1533|3644->1591|3675->1613|3714->1614|3760->1629|3798->1640|3813->1646|3862->1673|3939->1719|4025->1777|4057->1782|4088->1804|4127->1805|4173->1820|4211->1831|4226->1837|4273->1862|4353->1911|4406->1936|4498->2001|4526->2008|4567->2022|4626->2054|4641->2060|4702->2100
                  LINES: 28->1|33->2|36->5|36->5|49->18|49->18|49->18|52->21|52->21|52->21|53->22|53->22|53->22|53->22|53->22|53->22|53->22|53->22|54->23|54->23|54->23|54->23|54->23|54->23|54->23|55->24|55->24|55->24|55->24|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|57->26|57->26|57->26|57->26|57->26|58->27|58->27|58->27|58->27|58->27|58->27|58->27|59->28|61->30|61->30|61->30|61->30|61->30|61->30|61->30|61->30|62->31|63->32|66->35|66->35|68->37|71->40|71->40|71->40
                  -- GENERATED --
              */
          