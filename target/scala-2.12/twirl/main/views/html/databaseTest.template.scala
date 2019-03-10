
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

object databaseTest extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.Employees,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(emps: models.users.Employees):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Database", emps)/*2.24*/ {_display_(Seq[Any](format.raw/*2.26*/("""
    """),format.raw/*3.5*/("""<p>It works!</p>

    <tbody>
        <!-- Loop for creating table rows from Employee data  -->
        """),_display_(/*7.10*/for(i<-emps) yield /*7.22*/ {_display_(Seq[Any](format.raw/*7.24*/("""
            """),format.raw/*8.13*/("""<tr>
                <td>"""),_display_(/*9.22*/i/*9.23*/.getId),format.raw/*9.29*/("""</td>
                <td>"""),_display_(/*10.22*/i/*10.23*/.getType),format.raw/*10.31*/("""</td>
                <td>"""),_display_(/*11.22*/i/*11.23*/.getfName),format.raw/*11.32*/("""</td>
                <td>"""),_display_(/*12.22*/i/*12.23*/.getlName),format.raw/*12.32*/("""</td>
                <td>"""),_display_(/*13.22*/i/*13.23*/.getSalary),format.raw/*13.33*/("""</td>
            </tr>    
        """)))}),format.raw/*15.10*/("""
    """),format.raw/*16.5*/("""</tbody>
""")))}))
      }
    }
  }

  def render(emps:models.users.Employees): play.twirl.api.HtmlFormat.Appendable = apply(emps)

  def f:((models.users.Employees) => play.twirl.api.HtmlFormat.Appendable) = (emps) => apply(emps)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 10 21:53:36 GMT 2019
                  SOURCE: /home/wdd/Desktop/SDev_CA1/app/views/databaseTest.scala.html
                  HASH: 151a239632fc6358f24b3373c9b73075d2ab0242
                  MATRIX: 971->1|1095->33|1125->55|1164->57|1195->62|1326->167|1353->179|1392->181|1432->194|1484->220|1493->221|1519->227|1573->254|1583->255|1612->263|1666->290|1676->291|1706->300|1760->327|1770->328|1800->337|1854->364|1864->365|1895->375|1963->412|1995->417
                  LINES: 28->1|33->2|33->2|33->2|34->3|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|46->15|47->16
                  -- GENERATED --
              */
          