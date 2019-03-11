
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

<tbody>
    <!-- Loop for creating table rows from Employee data  -->

    <tr>
        """),_display_(/*9.10*/for(i<-elist) yield /*9.23*/ {_display_(Seq[Any](format.raw/*9.25*/("""
             """),format.raw/*10.14*/("""<td>"""),_display_(/*10.19*/i/*10.20*/.getId),format.raw/*10.26*/("""</td>
            <td>"""),_display_(/*11.18*/i/*11.19*/.getType),format.raw/*11.27*/("""</td>
            <td>"""),_display_(/*12.18*/i/*12.19*/.getfName),format.raw/*12.28*/("""</td>
            <td>"""),_display_(/*13.18*/i/*13.19*/.getlName),format.raw/*13.28*/("""</td>
            <td>"""),_display_(/*14.18*/i/*14.19*/.getSalary),format.raw/*14.29*/("""</td>

            """)))}),format.raw/*16.14*/(""" 
        """),format.raw/*17.9*/("""</tr>

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
                  DATE: Mon Mar 11 11:22:55 GMT 2019
                  SOURCE: /home/wdd/SDevProj/SDev_CA1/app/views/databaseTest.scala.html
                  HASH: 5fb3660124ab3311338ce3a0b0622053c5f23622
                  MATRIX: 1000->1|1161->70|1191->92|1230->94|1257->95|1390->202|1418->215|1457->217|1499->231|1531->236|1541->237|1568->243|1618->266|1628->267|1657->275|1707->298|1717->299|1747->308|1797->331|1807->332|1837->341|1887->364|1897->365|1928->375|1979->395|2016->405
                  LINES: 28->1|33->2|33->2|33->2|34->3|40->9|40->9|40->9|41->10|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|47->16|48->17
                  -- GENERATED --
              */
          