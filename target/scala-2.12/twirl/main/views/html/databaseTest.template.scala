
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

object databaseTest extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.Employee],models.users.Employee,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(items: List[models.Employee], emps: models.users.Employee):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Database", emps)/*2.24*/ {_display_(Seq[Any](format.raw/*2.26*/("""
    """),format.raw/*3.5*/("""<p>It works!</p>

    <tbody>
        <!-- Loop for creating table rows from Employee data  -->
        """),_display_(/*7.10*/for(i<-items) yield /*7.23*/ {_display_(Seq[Any](format.raw/*7.25*/("""
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

  def render(items:List[models.Employee],emps:models.users.Employee): play.twirl.api.HtmlFormat.Appendable = apply(items,emps)

  def f:((List[models.Employee],models.users.Employee) => play.twirl.api.HtmlFormat.Appendable) = (items,emps) => apply(items,emps)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 10 21:30:04 GMT 2019
                  SOURCE: /home/wdd/SDevProj/SDev_CA1/app/views/databaseTest.scala.html
                  HASH: a4fe23c8d7b5f7973afcafc3c4f278f29fe426b1
                  MATRIX: 992->1|1145->62|1175->84|1214->86|1245->91|1376->196|1404->209|1443->211|1483->224|1535->250|1544->251|1570->257|1624->284|1634->285|1663->293|1717->320|1727->321|1757->330|1811->357|1821->358|1851->367|1905->394|1915->395|1946->405|2014->442|2046->447
                  LINES: 28->1|33->2|33->2|33->2|34->3|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|46->15|47->16
                  -- GENERATED --
              */
          