
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

object databaseTest extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.users.Employees],models.users.Employees,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(elist: List[models.users.Employees], emps: models.users.Employees):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Database", emps)/*2.24*/ {_display_(Seq[Any](format.raw/*2.26*/("""
"""),format.raw/*3.1*/("""<p>It works!</p>

<table class="table table-bordered table-hover table-condensed">
        <thead>
            <!--Header-->
            <tr>
                <th>ID</th>
                <th>Type</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Salary</th>
            </tr>
        </thead>
<tbody>
    <!-- Loop for creating table rows from Employee data  -->

    
    <tr>
        """),_display_(/*21.10*/for(i<-elist) yield /*21.23*/ {_display_(Seq[Any](format.raw/*21.25*/("""
             """),format.raw/*22.14*/("""<td>"""),_display_(/*22.19*/i/*22.20*/.getId),format.raw/*22.26*/("""</td>
            <td>"""),_display_(/*23.18*/i/*23.19*/.getType),format.raw/*23.27*/("""</td>
            <td>"""),_display_(/*24.18*/i/*24.19*/.getfName),format.raw/*24.28*/("""</td>
            <td>"""),_display_(/*25.18*/i/*25.19*/.getlName),format.raw/*25.28*/("""</td>
            <td>&euro; """),_display_(/*26.25*/("%.2f".format(i.getSalary))),format.raw/*26.53*/("""</td>

        """)))}),format.raw/*28.10*/(""" 
        """),format.raw/*29.9*/("""</tr>

</tbody>
""")))}))
      }
    }
  }

  def render(elist:List[models.users.Employees],emps:models.users.Employees): play.twirl.api.HtmlFormat.Appendable = apply(elist,emps)

  def f:((List[models.users.Employees],models.users.Employees) => play.twirl.api.HtmlFormat.Appendable) = (elist,emps) => apply(elist,emps)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 11 11:55:28 GMT 2019
                  SOURCE: /home/wdd/SDevProj/SDev_CA1/app/views/databaseTest.scala.html
                  HASH: 3496ddd99d57ed453c29f513ebcae6254c1261cf
                  MATRIX: 1000->1|1161->70|1191->92|1230->94|1257->95|1716->527|1745->540|1785->542|1827->556|1859->561|1869->562|1896->568|1946->591|1956->592|1985->600|2035->623|2045->624|2075->633|2125->656|2135->657|2165->666|2222->696|2271->724|2318->740|2355->750
                  LINES: 28->1|33->2|33->2|33->2|34->3|52->21|52->21|52->21|53->22|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|59->28|60->29
                  -- GENERATED --
              */
          