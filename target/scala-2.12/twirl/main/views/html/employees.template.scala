
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

object employees extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.users.Manager],List[models.users.Worker],models.users.Employees,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(mlist: List[models.users.Manager], wlist: List[models.users.Worker], emps: models.users.Employees):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Employees", emps)/*2.25*/ {_display_(Seq[Any](format.raw/*2.27*/("""

    """),format.raw/*4.28*/("""
"""),_display_(/*5.2*/if(flash.containsKey("success"))/*5.34*/ {_display_(Seq[Any](format.raw/*5.36*/("""
"""),format.raw/*6.1*/("""<div class="alert- alert-success">
    """),_display_(/*7.6*/flash/*7.11*/.get("success")),format.raw/*7.26*/("""
"""),format.raw/*8.1*/("""</div>
""")))}),format.raw/*9.2*/("""
"""),format.raw/*10.1*/("""<table class="table table-bordered table-hover table-condensed">

    <thead>
        <!--Header-->
        <h2>Manager Table</h2>
        <tr>
            <th>ID</th>
            <th>Role</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Salary</th>
        </tr>
    </thead>

    <tbody>
        <!-- Loop for creating table rows from Employee data  -->

        """),_display_(/*27.10*/for(i<-mlist) yield /*27.23*/ {_display_(Seq[Any](format.raw/*27.25*/(""" """),format.raw/*27.26*/("""<tr>
            <td>"""),_display_(/*28.18*/i/*28.19*/.getId),format.raw/*28.25*/("""</td>
            <td>"""),_display_(/*29.18*/i/*29.19*/.getRole),format.raw/*29.27*/("""</td>
            <td>"""),_display_(/*30.18*/i/*30.19*/.getfName),format.raw/*30.28*/("""</td>
            <td>"""),_display_(/*31.18*/i/*31.19*/.getlName),format.raw/*31.28*/("""</td>
            <td>&euro; """),_display_(/*32.25*/("%.2f".format(i.getSalary))),format.raw/*32.53*/("""</td>

            <td>
                <a href=""""),_display_(/*35.27*/routes/*35.33*/.HomeController.updateManager(i.getEmail)),format.raw/*35.74*/("""" class="button-xs btn-danger">
                    <span class="glyphicon-pencil"></span>
                </a>
            </td>

            <td>
                <a href=""""),_display_(/*41.27*/routes/*41.33*/.HomeController.deleteManager(i.getEmail)),format.raw/*41.74*/("""" class="button-xs btn-danger">
                    <span class="glyphicon glyphicon-trash"></span>
                </a>
            </td>
            </tr>

            """)))}),format.raw/*47.14*/("""

            """),format.raw/*49.13*/("""<p>
                <a href=""""),_display_(/*50.27*/routes/*50.33*/.HomeController.addManager()),format.raw/*50.61*/("""">
                    <button class="btn btn-primary">Add a Manager</button>
                </a>
            </p>
    </tbody>


<table class="table table-bordered table-hover table-condensed">

    <thead>
        <!--Header-->
        <h2>Worker Table</h2>
        <tr>
            <th>ID</th>
            <th>Role</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Salary</th>
        </tr>
    </thead>

    <tbody>
        <!-- Loop for creating table rows from Employee data  -->

        """),_display_(/*74.10*/for(i<-wlist) yield /*74.23*/ {_display_(Seq[Any](format.raw/*74.25*/(""" """),format.raw/*74.26*/("""<tr>
            <td>"""),_display_(/*75.18*/i/*75.19*/.getId),format.raw/*75.25*/("""</td>
            <td>"""),_display_(/*76.18*/i/*76.19*/.getRole),format.raw/*76.27*/("""</td>
            <td>"""),_display_(/*77.18*/i/*77.19*/.getfName),format.raw/*77.28*/("""</td>
            <td>"""),_display_(/*78.18*/i/*78.19*/.getlName),format.raw/*78.28*/("""</td>
            <td>&euro; """),_display_(/*79.25*/("%.2f".format(i.getSalary))),format.raw/*79.53*/("""</td>

            <td>
                <a href=""""),_display_(/*82.27*/routes/*82.33*/.HomeController.updateWorker(i.getEmail)),format.raw/*82.73*/("""" class="button-xs btn-danger">
                    <span class="glyphicon-pencil"></span>
                </a>
            </td>

            <td>
                <a href=""""),_display_(/*88.27*/routes/*88.33*/.HomeController.deleteWorker(i.getEmail)),format.raw/*88.73*/("""" class="button-xs btn-danger">
                    <span class="glyphicon glyphicon-trash"></span>
                </a>
            </td>
            </tr>

            """)))}),format.raw/*94.14*/("""

            """),format.raw/*96.13*/("""<p>
                <a href=""""),_display_(/*97.27*/routes/*97.33*/.HomeController.addWorker()),format.raw/*97.60*/("""">
                    <button class="btn btn-primary">Add a Worker</button>
                </a>
            </p>
    </tbody>
    """)))}))
      }
    }
  }

  def render(mlist:List[models.users.Manager],wlist:List[models.users.Worker],emps:models.users.Employees): play.twirl.api.HtmlFormat.Appendable = apply(mlist,wlist,emps)

  def f:((List[models.users.Manager],List[models.users.Worker],models.users.Employees) => play.twirl.api.HtmlFormat.Appendable) = (mlist,wlist,emps) => apply(mlist,wlist,emps)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 15 11:11:30 GMT 2019
                  SOURCE: /home/wdd/Desktop/SDev_CA1/app/views/employees.scala.html
                  HASH: aa64caec2cbdad5437f4a8af4196f3460f4b41bc
                  MATRIX: 1021->1|1214->102|1245->125|1284->127|1317->156|1344->158|1384->190|1423->192|1450->193|1515->233|1528->238|1563->253|1590->254|1627->262|1655->263|2083->664|2112->677|2152->679|2181->680|2230->702|2240->703|2267->709|2317->732|2327->733|2356->741|2406->764|2416->765|2446->774|2496->797|2506->798|2536->807|2593->837|2642->865|2719->915|2734->921|2796->962|2997->1136|3012->1142|3074->1183|3276->1354|3318->1368|3375->1398|3390->1404|3439->1432|3997->1963|4026->1976|4066->1978|4095->1979|4144->2001|4154->2002|4181->2008|4231->2031|4241->2032|4270->2040|4320->2063|4330->2064|4360->2073|4410->2096|4420->2097|4450->2106|4507->2136|4556->2164|4633->2214|4648->2220|4709->2260|4910->2434|4925->2440|4986->2480|5188->2651|5230->2665|5287->2695|5302->2701|5350->2728
                  LINES: 28->1|33->2|33->2|33->2|35->4|36->5|36->5|36->5|37->6|38->7|38->7|38->7|39->8|40->9|41->10|58->27|58->27|58->27|58->27|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|66->35|66->35|66->35|72->41|72->41|72->41|78->47|80->49|81->50|81->50|81->50|105->74|105->74|105->74|105->74|106->75|106->75|106->75|107->76|107->76|107->76|108->77|108->77|108->77|109->78|109->78|109->78|110->79|110->79|113->82|113->82|113->82|119->88|119->88|119->88|125->94|127->96|128->97|128->97|128->97
                  -- GENERATED --
              */
          