
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

"""),format.raw/*5.24*/("""
"""),_display_(/*6.2*/if(flash.containsKey("success"))/*6.34*/ {_display_(Seq[Any](format.raw/*6.36*/("""
"""),format.raw/*7.1*/("""<div class="alert- alert-success">
    """),_display_(/*8.6*/flash/*8.11*/.get("success")),format.raw/*8.26*/("""
"""),format.raw/*9.1*/("""</div>
""")))}),format.raw/*10.2*/("""


"""),format.raw/*13.1*/("""<table class="table table-bordered table-hover table-condensed">
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

        """),_display_(/*29.10*/for(i<-plist) yield /*29.23*/ {_display_(Seq[Any](format.raw/*29.25*/(""" """),format.raw/*29.26*/("""<tr>
            <td>"""),_display_(/*30.18*/i/*30.19*/.getId),format.raw/*30.25*/("""</td>
            <td>"""),_display_(/*31.18*/i/*31.19*/.getName),format.raw/*31.27*/("""</td>
            <td>"""),_display_(/*32.18*/i/*32.19*/.getStartDate),format.raw/*32.32*/("""</td>
            <td>"""),_display_(/*33.18*/i/*33.19*/.getDueDate),format.raw/*33.30*/("""</td>
            <td>"""),_display_(/*34.18*/i/*34.19*/.getNumMembers),format.raw/*34.33*/("""</td>

            <!-- Button to update an existing project -->
            <td>
                <a href=""""),_display_(/*38.27*/routes/*38.33*/.HomeController.updateProject(i.getId)),format.raw/*38.71*/("""" class="button-xs btn-danger">
                    <span class="glyphicon-pencil"></span>
                </a>
            </td>


            <!-- Button to delete an existing project -->
            <td>
                <a href=""""),_display_(/*46.27*/routes/*46.33*/.HomeController.deleteProject(i.getId)),format.raw/*46.71*/("""" class="button-xs btn-danger">
                    <span class="glyphicon glyphicon-trash"></span>
                </a>
            </td>
        </tr>
        """)))}),format.raw/*51.10*/("""

            """),format.raw/*53.13*/("""<!-- Button to add a new project -->
            <p>
                <a href=""""),_display_(/*55.27*/routes/*55.33*/.HomeController.addProject()),format.raw/*55.61*/("""">
                    <button class="btn btn-primary">Add a Project</button>
                </a>
            </p>
    </tbody>

    
    <table class="table table-bordered table-hover table-condensed">
        <thead>
            <!--Header-->
            <h2>Address Table</h2>
            <tr>
                <th>Street 1</th>
                <th>Street 2</th>
                <th>Town</th>
                <th>Post Code</th>
            </tr>
        </thead>

        <tbody>
            <!-- Loop for creating table rows from Employee data  -->

            """),_display_(/*77.14*/for(i<-alist) yield /*77.27*/ {_display_(Seq[Any](format.raw/*77.29*/(""" 
                """),format.raw/*78.17*/("""<tr>
                <td>"""),_display_(/*79.22*/i/*79.23*/.getStreet1),format.raw/*79.34*/("""</td>
                <td>"""),_display_(/*80.22*/i/*80.23*/.getStreet2),format.raw/*80.34*/("""</td>
                <td>"""),_display_(/*81.22*/i/*81.23*/.getTown),format.raw/*81.31*/("""</td>
                <td>"""),_display_(/*82.22*/i/*82.23*/.getEircode),format.raw/*82.34*/("""</td>
                
                </tr>
                """)))}),format.raw/*85.18*/("""

        """),format.raw/*87.9*/("""</tbody>
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
                  DATE: Fri Mar 15 18:02:44 GMT 2019
                  SOURCE: /home/wdd/SDevProj/SDev_CA1/app/views/databaseTest.scala.html
                  HASH: 2125b074624172231034fa80441ab4fc3921d0eb
                  MATRIX: 1013->1|1195->91|1225->113|1264->115|1293->140|1320->142|1360->174|1399->176|1426->177|1491->217|1504->222|1539->237|1566->238|1604->246|1634->249|2070->658|2099->671|2139->673|2168->674|2217->696|2227->697|2254->703|2304->726|2314->727|2343->735|2393->758|2403->759|2437->772|2487->795|2497->796|2529->807|2579->830|2589->831|2624->845|2759->953|2774->959|2833->997|3093->1230|3108->1236|3167->1274|3360->1436|3402->1450|3508->1529|3523->1535|3572->1563|4166->2130|4195->2143|4235->2145|4281->2163|4334->2189|4344->2190|4376->2201|4430->2228|4440->2229|4472->2240|4526->2267|4536->2268|4565->2276|4619->2303|4629->2304|4661->2315|4754->2377|4791->2387
                  LINES: 28->1|34->3|34->3|34->3|36->5|37->6|37->6|37->6|38->7|39->8|39->8|39->8|40->9|41->10|44->13|60->29|60->29|60->29|60->29|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|69->38|69->38|69->38|77->46|77->46|77->46|82->51|84->53|86->55|86->55|86->55|108->77|108->77|108->77|109->78|110->79|110->79|110->79|111->80|111->80|111->80|112->81|112->81|112->81|113->82|113->82|113->82|116->85|118->87
                  -- GENERATED --
              */
          