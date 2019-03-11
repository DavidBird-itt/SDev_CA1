
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
        
        """),_display_(/*20.10*/for(i<-elist) yield /*20.23*/ {_display_(Seq[Any](format.raw/*20.25*/(""" 
            """),format.raw/*21.13*/("""<tr>
                <td>"""),_display_(/*22.22*/i/*22.23*/.getId),format.raw/*22.29*/("""</td>
                <td>"""),_display_(/*23.22*/i/*23.23*/.getType),format.raw/*23.31*/("""</td>
                <td>"""),_display_(/*24.22*/i/*24.23*/.getfName),format.raw/*24.32*/("""</td>
                <td>"""),_display_(/*25.22*/i/*25.23*/.getlName),format.raw/*25.32*/("""</td>
                <td>&euro; """),_display_(/*26.29*/("%.2f".format(i.getSalary))),format.raw/*26.57*/("""</td>
            </tr>
                """)))}),format.raw/*28.18*/("""
       

    """),format.raw/*31.5*/("""</tbody>
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
                  DATE: Mon Mar 11 21:57:34 GMT 2019
                  SOURCE: /home/wdd/SDevProj/SDev_CA1/app/views/databaseTest.scala.html
                  HASH: 7d4e46f3b39c4c5819e8249b84f5e0ceb265fd0a
                  MATRIX: 1000->1|1161->70|1191->92|1230->94|1257->95|1679->490|1708->503|1748->505|1790->519|1843->545|1853->546|1880->552|1934->579|1944->580|1973->588|2027->615|2037->616|2067->625|2121->652|2131->653|2161->662|2222->696|2271->724|2343->765|2384->779
                  LINES: 28->1|33->2|33->2|33->2|34->3|51->20|51->20|51->20|52->21|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|59->28|62->31
                  -- GENERATED --
              */
          