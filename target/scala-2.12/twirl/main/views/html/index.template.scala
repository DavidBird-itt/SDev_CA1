
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[models.Address,models.users.Employees,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(address: models.Address, emp: models.users.Employees, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Home", emp)/*2.19*/{_display_(Seq[Any](format.raw/*2.20*/("""

	"""),format.raw/*4.2*/("""<table class="table table-bordered table-hover table-condensed">
	
		<thead>
			<!--Header-->
			<h2>Personal Info</h2>
			<tr>
				<th>Image</th>
				<th>ID</th>
				<th>Role</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Salary</th>
			</tr>
		</thead>
	
		<tbody>
			<!-- Loop for creating table rows from Employee data  -->
	
			<tr>
	
				"""),_display_(/*24.6*/if(env.resource("public/images/workerImages/" + emp.getId + "thumb.jpg").isDefined)/*24.89*/ {_display_(Seq[Any](format.raw/*24.91*/("""
					"""),format.raw/*25.6*/("""<td><img src="/assets/images/workerImages"""),_display_(/*25.48*/(emp.getId + "thumb.jpg")),format.raw/*25.73*/(""""/></td>
				""")))}/*26.7*/else/*26.12*/{_display_(Seq[Any](format.raw/*26.13*/("""
					"""),format.raw/*27.6*/("""<td><img src="/assets/images/workerImages/noImage.jpg"/></td>
				""")))}),format.raw/*28.6*/("""
	
				"""),format.raw/*30.5*/("""<td>"""),_display_(/*30.10*/emp/*30.13*/.getId),format.raw/*30.19*/("""</td>
				<td>"""),_display_(/*31.10*/emp/*31.13*/.getRole),format.raw/*31.21*/("""</td>
				<td>"""),_display_(/*32.10*/emp/*32.13*/.getfName),format.raw/*32.22*/("""</td>
				<td>"""),_display_(/*33.10*/emp/*33.13*/.getlName),format.raw/*33.22*/("""</td>
				<td>&euro; """),_display_(/*34.17*/("%.2f".format(emp.getSalary))),format.raw/*34.47*/("""</td>
	
				<td>
					<a href=""""),_display_(/*37.16*/routes/*37.22*/.HomeController.updateWorker(emp.getEmail)),format.raw/*37.64*/("""" class="button-xs btn-danger">
						<span class="glyphicon-pencil"></span>
					</a>
				</td>
	
				</tr>
	
		</tbody>

		
		""")))}))
      }
    }
  }

  def render(address:models.Address,emp:models.users.Employees,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(address,emp,env)

  def f:((models.Address,models.users.Employees,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (address,emp,env) => apply(address,emp,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 20:49:18 GMT 2019
                  SOURCE: /home/wdd/SDevProj/SDev_CA1/app/views/index.scala.html
                  HASH: fbb0b1caaf693b7b34166e0296d363af4124e37d
                  MATRIX: 1000->1|1175->84|1200->101|1238->102|1267->105|1651->463|1743->546|1783->548|1816->554|1885->596|1931->621|1963->636|1976->641|2015->642|2048->648|2145->715|2179->722|2211->727|2223->730|2250->736|2292->751|2304->754|2333->762|2375->777|2387->780|2417->789|2459->804|2471->807|2501->816|2550->838|2601->868|2660->900|2675->906|2738->948
                  LINES: 28->1|33->2|33->2|33->2|35->4|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|58->27|59->28|61->30|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|68->37|68->37|68->37
                  -- GENERATED --
              */
          