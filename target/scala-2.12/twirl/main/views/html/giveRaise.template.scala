
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

object giveRaise extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.users.Worker],models.users.Employees,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(wlist: List[models.users.Worker], emp: models.users.Employees, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Raise", emp)/*2.20*/ {_display_(Seq[Any](format.raw/*2.22*/("""

    """),format.raw/*4.28*/("""
"""),_display_(/*5.2*/if(flash.containsKey("success"))/*5.34*/ {_display_(Seq[Any](format.raw/*5.36*/("""
"""),format.raw/*6.1*/("""<div class="alert- alert-success">
    """),_display_(/*7.6*/flash/*7.11*/.get("success")),format.raw/*7.26*/("""
"""),format.raw/*8.1*/("""</div>
""")))}),format.raw/*9.2*/("""


"""),format.raw/*12.1*/("""<table class="table table-bordered table-hover table-condensed">

    <thead>
        <!--Header-->
        <h2>Worker Table</h2>
        <tr>
            <th>Image</th>
            <th>ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Salary</th>
        </tr>
    </thead>

    <tbody>
        <!-- Loop for creating table rows from Employee data  -->

        """),_display_(/*29.10*/for(i<-wlist) yield /*29.23*/ {_display_(Seq[Any](format.raw/*29.25*/(""" """),format.raw/*29.26*/("""<tr>

            """),_display_(/*31.14*/if(env.resource("public/images/workerImages/" + i.getId + "thumb.jpg").isDefined)/*31.95*/ {_display_(Seq[Any](format.raw/*31.97*/("""
                """),format.raw/*32.17*/("""<td><img src="/assets/images/workerImages/"""),_display_(/*32.60*/(i.getId + "thumb.jpg")),format.raw/*32.83*/(""""/></td>
            """)))}/*33.15*/else/*33.20*/{_display_(Seq[Any](format.raw/*33.21*/("""
                """),format.raw/*34.17*/("""<td><img src="/assets/images/workerImages/noImage.jpg"/></td>
            """)))}),format.raw/*35.14*/("""

            """),format.raw/*37.13*/("""<td>"""),_display_(/*37.18*/i/*37.19*/.getId),format.raw/*37.25*/("""</td>
            <td>"""),_display_(/*38.18*/i/*38.19*/.getfName),format.raw/*38.28*/("""</td>
            <td>"""),_display_(/*39.18*/i/*39.19*/.getlName),format.raw/*39.28*/("""</td>
            <td>&euro; """),_display_(/*40.25*/("%.2f".format(i.getSalary))),format.raw/*40.53*/("""</td>

            <td>
                <a href=""""),_display_(/*43.27*/routes/*43.33*/.HomeController.raiseSubmit(i.getEmail)),format.raw/*43.72*/("""" class="button-xs btn-danger">
                    <span class="glyphicon-pencil"></span>
                </a>
            </td>
        </tr>
    </tbody>
    """)))}),format.raw/*49.6*/("""
""")))}))
      }
    }
  }

  def render(wlist:List[models.users.Worker],emp:models.users.Employees,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(wlist,emp,env)

  def f:((List[models.users.Worker],models.users.Employees,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (wlist,emp,env) => apply(wlist,emp,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 20:34:35 GMT 2019
                  SOURCE: /home/wdd/SDevProj/SDev_CA1/app/views/giveRaise.scala.html
                  HASH: 218d8cd30d19cb8adfe3d3aa5c12acb2b20f5b67
                  MATRIX: 1015->1|1199->93|1225->111|1264->113|1297->142|1324->144|1364->176|1403->178|1430->179|1495->219|1508->224|1543->239|1570->240|1607->248|1637->251|2065->652|2094->665|2134->667|2163->668|2209->687|2299->768|2339->770|2384->787|2454->830|2498->853|2539->876|2552->881|2591->882|2636->899|2742->974|2784->988|2816->993|2826->994|2853->1000|2903->1023|2913->1024|2943->1033|2993->1056|3003->1057|3033->1066|3090->1096|3139->1124|3216->1174|3231->1180|3291->1219|3483->1381
                  LINES: 28->1|33->2|33->2|33->2|35->4|36->5|36->5|36->5|37->6|38->7|38->7|38->7|39->8|40->9|43->12|60->29|60->29|60->29|60->29|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|66->35|68->37|68->37|68->37|68->37|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|74->43|74->43|74->43|80->49
                  -- GENERATED --
              */
          