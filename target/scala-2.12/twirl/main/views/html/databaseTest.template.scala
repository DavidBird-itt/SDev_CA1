
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

object databaseTest extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.Employee],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(items: List[models.Employee]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Database")/*2.18*/ {_display_(Seq[Any](format.raw/*2.20*/("""
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

  def render(items:List[models.Employee]): play.twirl.api.HtmlFormat.Appendable = apply(items)

  def f:((List[models.Employee]) => play.twirl.api.HtmlFormat.Appendable) = (items) => apply(items)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 10 20:26:47 GMT 2019
                  SOURCE: /home/wdd/Desktop/SDev_CA1/app/views/databaseTest.scala.html
                  HASH: 0eaebe9c94ac960a2c76f1de38a5bb776256a3c3
                  MATRIX: 970->1|1094->33|1118->49|1157->51|1188->56|1319->161|1347->174|1386->176|1426->189|1478->215|1487->216|1513->222|1567->249|1577->250|1606->258|1660->285|1670->286|1700->295|1754->322|1764->323|1794->332|1848->359|1858->360|1889->370|1957->407|1989->412
                  LINES: 28->1|33->2|33->2|33->2|34->3|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|46->15|47->16
                  -- GENERATED --
              */
          