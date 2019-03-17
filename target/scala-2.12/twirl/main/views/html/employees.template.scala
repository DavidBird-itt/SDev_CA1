
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
                """),format.raw/*33.17*/("""<td><img src="/assets/images/workerImages/noImage.jpg"/></td>
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

        """),_display_(/*83.10*/for(i<-wlist) yield /*83.23*/ {_display_(Seq[Any](format.raw/*83.25*/(""" """),format.raw/*83.26*/("""<tr>

            """),_display_(/*85.14*/if(env.resource("public/images/workerImages/" + i.getId + "thumb.jpg").isDefined)/*85.95*/ {_display_(Seq[Any](format.raw/*85.97*/("""
                """),format.raw/*86.17*/("""<td><img src="/assets/images/workerImages/"""),_display_(/*86.60*/(i.getId + "thumb.jpg")),format.raw/*86.83*/(""""/></td>
            """)))}/*87.15*/else/*87.20*/{_display_(Seq[Any](format.raw/*87.21*/("""
                """),format.raw/*88.17*/("""<td><img src="/assets/images/workerImages/noImage.jpg"/></td>
            """)))}),format.raw/*89.14*/("""

            """),format.raw/*91.13*/("""<td>"""),_display_(/*91.18*/i/*91.19*/.getId),format.raw/*91.25*/("""</td>
            <td>"""),_display_(/*92.18*/i/*92.19*/.getRole),format.raw/*92.27*/("""</td>
            <td>"""),_display_(/*93.18*/i/*93.19*/.getfName),format.raw/*93.28*/("""</td>
            <td>"""),_display_(/*94.18*/i/*94.19*/.getlName),format.raw/*94.28*/("""</td>
            <td>&euro; """),_display_(/*95.25*/("%.2f".format(i.getSalary))),format.raw/*95.53*/("""</td>

            <td>
                <a href=""""),_display_(/*98.27*/routes/*98.33*/.HomeController.updateWorker(i.getEmail)),format.raw/*98.73*/("""" class="button-xs btn-danger">
                    <span class="glyphicon-pencil"></span>
                </a>
            </td>

            <td>
                <a href=""""),_display_(/*104.27*/routes/*104.33*/.HomeController.deleteWorker(i.getEmail)),format.raw/*104.73*/("""" class="button-xs btn-danger">
                    <span class="glyphicon glyphicon-trash"></span>
                </a>
            </td>
            </tr>

            """)))}),format.raw/*110.14*/("""

            """),format.raw/*112.13*/("""<p>
                <a href=""""),_display_(/*113.27*/routes/*113.33*/.HomeController.addWorker()),format.raw/*113.60*/("""">
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
                  DATE: Sun Mar 17 14:12:46 GMT 2019
                  SOURCE: /home/wdd/SDevProj/SDev_CA1/app/views/employees.scala.html
                  HASH: e5e164a10a2073389338daf54635b17e6874c4f8
                  MATRIX: 1042->1|1262->129|1293->152|1332->154|1365->183|1392->185|1432->217|1471->219|1498->220|1563->260|1576->265|1611->280|1638->281|1675->289|1703->290|2158->718|2187->731|2227->733|2256->734|2302->753|2392->834|2432->836|2477->853|2546->895|2590->918|2631->941|2644->946|2683->947|2728->964|2834->1039|2876->1053|2908->1058|2918->1059|2945->1065|2995->1088|3005->1089|3034->1097|3084->1120|3094->1121|3124->1130|3174->1153|3184->1154|3214->1163|3271->1193|3320->1221|3397->1271|3412->1277|3474->1318|3675->1492|3690->1498|3752->1539|3954->1710|3996->1724|4053->1754|4068->1760|4117->1788|4702->2346|4731->2359|4771->2361|4800->2362|4846->2381|4936->2462|4976->2464|5021->2481|5091->2524|5135->2547|5176->2570|5189->2575|5228->2576|5273->2593|5379->2668|5421->2682|5453->2687|5463->2688|5490->2694|5540->2717|5550->2718|5579->2726|5629->2749|5639->2750|5669->2759|5719->2782|5729->2783|5759->2792|5816->2822|5865->2850|5942->2900|5957->2906|6018->2946|6220->3120|6236->3126|6298->3166|6501->3337|6544->3351|6602->3381|6618->3387|6667->3414
                  LINES: 28->1|33->2|33->2|33->2|35->4|36->5|36->5|36->5|37->6|38->7|38->7|38->7|39->8|40->9|41->10|59->28|59->28|59->28|59->28|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|65->34|67->36|67->36|67->36|67->36|68->37|68->37|68->37|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|74->43|74->43|74->43|80->49|80->49|80->49|86->55|88->57|89->58|89->58|89->58|114->83|114->83|114->83|114->83|116->85|116->85|116->85|117->86|117->86|117->86|118->87|118->87|118->87|119->88|120->89|122->91|122->91|122->91|122->91|123->92|123->92|123->92|124->93|124->93|124->93|125->94|125->94|125->94|126->95|126->95|129->98|129->98|129->98|135->104|135->104|135->104|141->110|143->112|144->113|144->113|144->113
                  -- GENERATED --
              */
          