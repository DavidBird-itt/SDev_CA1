
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.users.Employees,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(emp: models.users.Employees, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
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

  def render(emp:models.users.Employees,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(emp,env)

  def f:((models.users.Employees,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (emp,env) => apply(emp,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 19:14:21 GMT 2019
                  SOURCE: /home/wdd/Desktop/SDev_CA1/app/views/index.scala.html
                  HASH: a08303b65e3864258cb0ff461ac309d9f6f4cde9
                  MATRIX: 985->1|1135->59|1160->76|1198->77|1227->80|1611->438|1703->521|1743->523|1776->529|1845->571|1891->596|1923->611|1936->616|1975->617|2008->623|2105->690|2139->697|2171->702|2183->705|2210->711|2252->726|2264->729|2293->737|2335->752|2347->755|2377->764|2419->779|2431->782|2461->791|2510->813|2561->843|2620->875|2635->881|2698->923
                  LINES: 28->1|33->2|33->2|33->2|35->4|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|58->27|59->28|61->30|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|68->37|68->37|68->37
                  -- GENERATED --
              */
          