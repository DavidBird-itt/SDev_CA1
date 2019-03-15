
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

object employees extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[models.users.Manager],List[models.users.Worker],models.users.Employees,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(mlist: List[models.users.Manager], wlist: List[models.users.Worker], emps: models.users.Employees, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
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

        """),_display_(/*28.10*/for(i<-mlist) yield /*28.23*/ {_display_(Seq[Any](format.raw/*28.25*/(""" """),format.raw/*28.26*/("""<tr>

            """),_display_(/*30.14*/if(env.resource("public/images/workerImages/" + i.getId + "thumb.jpg").isDefined)/*30.95*/ {_display_(Seq[Any](format.raw/*30.97*/("""
                """),format.raw/*31.17*/("""<td><img src="/assets/images/workerImages"""),_display_(/*31.59*/(i.getId + "thumb.jpg")),format.raw/*31.82*/(""""/></td>
            """)))}/*32.15*/else/*32.20*/{_display_(Seq[Any](format.raw/*32.21*/("""
                """),format.raw/*33.17*/("""<td><img src="/assets/images/workerImages/noImage/jpg"/></td>
            """)))}),format.raw/*34.14*/("""

            """),format.raw/*36.13*/("""<td>"""),_display_(/*36.18*/i/*36.19*/.getId),format.raw/*36.25*/("""</td>
            <td>"""),_display_(/*37.18*/i/*37.19*/.getRole),format.raw/*37.27*/("""</td>
            <td>"""),_display_(/*38.18*/i/*38.19*/.getfName),format.raw/*38.28*/("""</td>
            <td>"""),_display_(/*39.18*/i/*39.19*/.getlName),format.raw/*39.28*/("""</td>
            <td>&euro; """),_display_(/*40.25*/("%.2f".format(i.getSalary))),format.raw/*40.53*/("""</td>

            <td>
                <a href=""""),_display_(/*43.27*/routes/*43.33*/.HomeController.updateManager(i.getEmail)),format.raw/*43.74*/("""" class="button-xs btn-danger">
                    <span class="glyphicon-pencil"></span>
                </a>
            </td>

            <td>
                <a href=""""),_display_(/*49.27*/routes/*49.33*/.HomeController.deleteManager(i.getEmail)),format.raw/*49.74*/("""" class="button-xs btn-danger">
                    <span class="glyphicon glyphicon-trash"></span>
                </a>
            </td>
            </tr>

            """)))}),format.raw/*55.14*/("""

            """),format.raw/*57.13*/("""<p>
                <a href=""""),_display_(/*58.27*/routes/*58.33*/.HomeController.addManager()),format.raw/*58.61*/("""">
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

        """),_display_(/*82.10*/for(i<-wlist) yield /*82.23*/ {_display_(Seq[Any](format.raw/*82.25*/(""" """),format.raw/*82.26*/("""<tr>
            <td>"""),_display_(/*83.18*/i/*83.19*/.getId),format.raw/*83.25*/("""</td>
            <td>"""),_display_(/*84.18*/i/*84.19*/.getRole),format.raw/*84.27*/("""</td>
            <td>"""),_display_(/*85.18*/i/*85.19*/.getfName),format.raw/*85.28*/("""</td>
            <td>"""),_display_(/*86.18*/i/*86.19*/.getlName),format.raw/*86.28*/("""</td>
            <td>&euro; """),_display_(/*87.25*/("%.2f".format(i.getSalary))),format.raw/*87.53*/("""</td>

            <td>
                <a href=""""),_display_(/*90.27*/routes/*90.33*/.HomeController.updateWorker(i.getEmail)),format.raw/*90.73*/("""" class="button-xs btn-danger">
                    <span class="glyphicon-pencil"></span>
                </a>
            </td>

            <td>
                <a href=""""),_display_(/*96.27*/routes/*96.33*/.HomeController.deleteWorker(i.getEmail)),format.raw/*96.73*/("""" class="button-xs btn-danger">
                    <span class="glyphicon glyphicon-trash"></span>
                </a>
            </td>
            </tr>

            """)))}),format.raw/*102.14*/("""

            """),format.raw/*104.13*/("""<p>
                <a href=""""),_display_(/*105.27*/routes/*105.33*/.HomeController.addWorker()),format.raw/*105.60*/("""">
                    <button class="btn btn-primary">Add a Worker</button>
                </a>
            </p>
    </tbody>
    """)))}))
      }
    }
  }

  def render(mlist:List[models.users.Manager],wlist:List[models.users.Worker],emps:models.users.Employees,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(mlist,wlist,emps,env)

  def f:((List[models.users.Manager],List[models.users.Worker],models.users.Employees,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (mlist,wlist,emps,env) => apply(mlist,wlist,emps,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 15 14:33:39 GMT 2019
                  SOURCE: /home/wdd/SDevProj/SDev_CA1/app/views/employees.scala.html
                  HASH: 61919a0f76229e02ce908ab7ee7c56a2ec799c54
                  MATRIX: 1042->1|1262->129|1293->152|1332->154|1365->183|1392->185|1432->217|1471->219|1498->220|1563->260|1576->265|1611->280|1638->281|1675->289|1703->290|2158->718|2187->731|2227->733|2256->734|2302->753|2392->834|2432->836|2477->853|2546->895|2590->918|2631->941|2644->946|2683->947|2728->964|2834->1039|2876->1053|2908->1058|2918->1059|2945->1065|2995->1088|3005->1089|3034->1097|3084->1120|3094->1121|3124->1130|3174->1153|3184->1154|3214->1163|3271->1193|3320->1221|3397->1271|3412->1277|3474->1318|3675->1492|3690->1498|3752->1539|3954->1710|3996->1724|4053->1754|4068->1760|4117->1788|4675->2319|4704->2332|4744->2334|4773->2335|4822->2357|4832->2358|4859->2364|4909->2387|4919->2388|4948->2396|4998->2419|5008->2420|5038->2429|5088->2452|5098->2453|5128->2462|5185->2492|5234->2520|5311->2570|5326->2576|5387->2616|5588->2790|5603->2796|5664->2836|5867->3007|5910->3021|5968->3051|5984->3057|6033->3084
                  LINES: 28->1|33->2|33->2|33->2|35->4|36->5|36->5|36->5|37->6|38->7|38->7|38->7|39->8|40->9|41->10|59->28|59->28|59->28|59->28|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|65->34|67->36|67->36|67->36|67->36|68->37|68->37|68->37|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|74->43|74->43|74->43|80->49|80->49|80->49|86->55|88->57|89->58|89->58|89->58|113->82|113->82|113->82|113->82|114->83|114->83|114->83|115->84|115->84|115->84|116->85|116->85|116->85|117->86|117->86|117->86|118->87|118->87|121->90|121->90|121->90|127->96|127->96|127->96|133->102|135->104|136->105|136->105|136->105
                  -- GENERATED --
              */
          