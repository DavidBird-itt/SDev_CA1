
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

            """),_display_(/*41.14*/if(emps.getId() == 1)/*41.35*/{_display_(Seq[Any](format.raw/*41.36*/("""
            """),format.raw/*42.13*/("""<td>
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
        """)))}),format.raw/*54.10*/("""
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
                  DATE: Mon Mar 18 20:14:38 GMT 2019
                  SOURCE: /home/wdd/SDevProj/SDev_CA1/app/views/employees.scala.html
                  HASH: 87eadc5a61d915ff8102f7ee050e167ff7396595
                  MATRIX: 1042->1|1262->129|1293->152|1332->154|1365->183|1392->185|1432->217|1471->219|1498->220|1563->260|1576->265|1611->280|1638->281|1675->289|1703->290|2158->718|2187->731|2227->733|2256->734|2302->753|2392->834|2432->836|2477->853|2546->895|2590->918|2631->941|2644->946|2683->947|2728->964|2834->1039|2876->1053|2908->1058|2918->1059|2945->1065|2995->1088|3005->1089|3034->1097|3084->1120|3094->1121|3124->1130|3174->1153|3184->1154|3214->1163|3261->1183|3291->1204|3330->1205|3371->1218|3429->1249|3444->1255|3506->1296|3707->1470|3722->1476|3784->1517|3981->1683|4026->1697|4068->1711|4125->1741|4140->1747|4189->1775|4774->2333|4803->2346|4843->2348|4872->2349|4918->2368|5008->2449|5048->2451|5093->2468|5163->2511|5207->2534|5248->2557|5261->2562|5300->2563|5345->2580|5451->2655|5493->2669|5525->2674|5535->2675|5562->2681|5612->2704|5622->2705|5651->2713|5701->2736|5711->2737|5741->2746|5791->2769|5801->2770|5831->2779|5888->2809|5937->2837|6014->2887|6029->2893|6090->2933|6292->3107|6308->3113|6370->3153|6573->3324|6616->3338|6674->3368|6690->3374|6739->3401
                  LINES: 28->1|33->2|33->2|33->2|35->4|36->5|36->5|36->5|37->6|38->7|38->7|38->7|39->8|40->9|41->10|59->28|59->28|59->28|59->28|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|65->34|67->36|67->36|67->36|67->36|68->37|68->37|68->37|69->38|69->38|69->38|70->39|70->39|70->39|72->41|72->41|72->41|73->42|74->43|74->43|74->43|80->49|80->49|80->49|85->54|86->55|88->57|89->58|89->58|89->58|114->83|114->83|114->83|114->83|116->85|116->85|116->85|117->86|117->86|117->86|118->87|118->87|118->87|119->88|120->89|122->91|122->91|122->91|122->91|123->92|123->92|123->92|124->93|124->93|124->93|125->94|125->94|125->94|126->95|126->95|129->98|129->98|129->98|135->104|135->104|135->104|141->110|143->112|144->113|144->113|144->113
                  -- GENERATED --
              */
          