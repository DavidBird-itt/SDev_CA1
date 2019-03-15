
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

object databaseTest extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.Project],List[models.Address],models.users.Employees,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(plist: List[models.Project], alist: List[models.Address], 
        emps: models.users.Employees):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*3.2*/main("Database", emps)/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""

    """),format.raw/*5.28*/("""
    """),_display_(/*6.6*/if(flash.containsKey("success"))/*6.38*/ {_display_(Seq[Any](format.raw/*6.40*/("""
        """),format.raw/*7.9*/("""<div class="alert- alert-success">
            """),_display_(/*8.14*/flash/*8.19*/.get("success")),format.raw/*8.34*/("""
        """),format.raw/*9.9*/("""</div>
    """)))}),format.raw/*10.6*/("""

 
    """),format.raw/*13.5*/("""<table class="table table-bordered table-hover table-condensed">
    <thead>
        <!--Header-->
        <h2>Project Table</h2>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Start Date</th>
            <th>Due Date</th>
            <th>Number of Members</th>
        </tr>
    </thead>

    <tbody>
        <!-- Loop for creating table rows from Project data  -->
        
        """),_display_(/*29.10*/for(i<-plist) yield /*29.23*/ {_display_(Seq[Any](format.raw/*29.25*/(""" 
            """),format.raw/*30.13*/("""<tr>
                <td>"""),_display_(/*31.22*/i/*31.23*/.getId),format.raw/*31.29*/("""</td>
                <td>"""),_display_(/*32.22*/i/*32.23*/.getName),format.raw/*32.31*/("""</td>
                <td>"""),_display_(/*33.22*/i/*33.23*/.getStartDate),format.raw/*33.36*/("""</td>
                <td>"""),_display_(/*34.22*/i/*34.23*/.getDueDate),format.raw/*34.34*/("""</td>
                <td>"""),_display_(/*35.22*/i/*35.23*/.getNumMembers),format.raw/*35.37*/("""</td>
            </tr>
        """)))}),format.raw/*37.10*/("""
       
    
"""),format.raw/*40.1*/("""<!-- Button to add a new project -->
    <p>
        <a href=""""),_display_(/*42.19*/routes/*42.25*/.HomeController.addProject()),format.raw/*42.53*/("""">
            <button class="btn btn-primary">Add a Project</button>
        </a>
    </p>

<!-- Button to update an existing project -->
<!-- this was added but was giving errors even when commented -->

</tbody>
    <table class="table table-bordered table-hover table-condensed">
    <thead>
        <!--Header-->
        <h2>Address Table</h2>
        <tr>
            <th>Eircode</th>
            <th>Street 1</th>
            <th>Town</th>
            <th>County</th>
        </tr>
    </thead>

    <tbody>
        <!-- Loop for creating table rows from Employee data  -->
        
        """),_display_(/*66.10*/for(i<-alist) yield /*66.23*/ {_display_(Seq[Any](format.raw/*66.25*/(""" 
            """),format.raw/*67.13*/("""<tr>
                <td>"""),_display_(/*68.22*/i/*68.23*/.getEircode),format.raw/*68.34*/("""</td>
                <td>"""),_display_(/*69.22*/i/*69.23*/.getStreet1),format.raw/*69.34*/("""</td>
                <td>"""),_display_(/*70.22*/i/*70.23*/.getTown),format.raw/*70.31*/("""</td>
                <td>"""),_display_(/*71.22*/i/*71.23*/.getCounty),format.raw/*71.33*/("""</td>
            </tr>
        """)))}),format.raw/*73.10*/("""
       
    """),format.raw/*75.5*/("""</tbody>
    """)))}))
      }
    }
  }

  def render(plist:List[models.Project],alist:List[models.Address],emps:models.users.Employees): play.twirl.api.HtmlFormat.Appendable = apply(plist,alist,emps)

  def f:((List[models.Project],List[models.Address],models.users.Employees) => play.twirl.api.HtmlFormat.Appendable) = (plist,alist,emps) => apply(plist,alist,emps)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 15 11:11:30 GMT 2019
                  SOURCE: /home/wdd/Desktop/SDev_CA1/app/views/databaseTest.scala.html
                  HASH: fcecc62ec47a13f5f373b67fc77e37d11c25dfef
                  MATRIX: 1013->1|1204->100|1234->122|1273->124|1306->153|1337->159|1377->191|1416->193|1451->202|1525->250|1538->255|1573->270|1608->279|1650->291|1685->299|2129->716|2158->729|2198->731|2240->745|2293->771|2303->772|2330->778|2384->805|2394->806|2423->814|2477->841|2487->842|2521->855|2575->882|2585->883|2617->894|2671->921|2681->922|2716->936|2780->969|2821->983|2911->1046|2926->1052|2975->1080|3601->1679|3630->1692|3670->1694|3712->1708|3765->1734|3775->1735|3807->1746|3861->1773|3871->1774|3903->1785|3957->1812|3967->1813|3996->1821|4050->1848|4060->1849|4091->1859|4155->1892|4195->1905
                  LINES: 28->1|34->3|34->3|34->3|36->5|37->6|37->6|37->6|38->7|39->8|39->8|39->8|40->9|41->10|44->13|60->29|60->29|60->29|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|66->35|66->35|66->35|68->37|71->40|73->42|73->42|73->42|97->66|97->66|97->66|98->67|99->68|99->68|99->68|100->69|100->69|100->69|101->70|101->70|101->70|102->71|102->71|102->71|104->73|106->75
                  -- GENERATED --
              */
          