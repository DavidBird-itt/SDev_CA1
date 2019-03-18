
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

object databaseTest extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[models.Project],List[models.Address],List[models.Department],models.users.Employees,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(plist: List[models.Project], alist: List[models.Address], dlist: List[models.Department],
emps: models.users.Employees):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*3.2*/main("Projects", emps)/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""

"""),format.raw/*5.24*/("""
"""),_display_(/*6.2*/if(flash.containsKey("success"))/*6.34*/ {_display_(Seq[Any](format.raw/*6.36*/("""
"""),format.raw/*7.1*/("""<div class="alert- alert-success">
    """),_display_(/*8.6*/flash/*8.11*/.get("success")),format.raw/*8.26*/("""
"""),format.raw/*9.1*/("""</div>
""")))}),format.raw/*10.2*/("""


"""),format.raw/*13.1*/("""<table class="table table-bordered table-hover table-condensed">
    <thead>
        <!--Header-->
        <h2>Projects</h2>
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
            """),_display_(/*35.14*/if("Manager".equals(emps.getRole()))/*35.50*/{_display_(Seq[Any](format.raw/*35.51*/("""
            """),format.raw/*36.13*/("""<!-- Button to update an existing project -->
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
            """)))}),format.raw/*51.14*/(""" 
        """)))}),format.raw/*52.10*/("""

        """),_display_(/*54.10*/if("Manager".equals(emps.getRole()))/*54.46*/{_display_(Seq[Any](format.raw/*54.47*/("""
            """),format.raw/*55.13*/("""<!-- Button to add a new project -->
            <p>
                <a href=""""),_display_(/*57.27*/routes/*57.33*/.HomeController.addProject()),format.raw/*57.61*/("""">
                    <button class="btn btn-primary">Add a Project</button>
                </a>
            </p>
        """)))}),format.raw/*61.10*/("""
    """),format.raw/*62.5*/("""</tbody>


    """),_display_(/*65.6*/if("Manager".equals(emps.getRole()))/*65.42*/{_display_(Seq[Any](format.raw/*65.43*/("""
    """),format.raw/*66.5*/("""<table class="table table-bordered table-hover table-condensed">
        <thead>
            <h2>Department Table</h2>
            <tr>
                <th> ID </th>
                <th> Name </th>

        </thead>

        <tbody>

            """),_display_(/*77.14*/for(i<-dlist) yield /*77.27*/ {_display_(Seq[Any](format.raw/*77.29*/(""" """),format.raw/*77.30*/("""<tr>
                <td>"""),_display_(/*78.22*/i/*78.23*/.getId),format.raw/*78.29*/("""</td>
                <td>"""),_display_(/*79.22*/i/*79.23*/.getName),format.raw/*79.31*/("""</td>

                <td>
                    <a href=""""),_display_(/*82.31*/routes/*82.37*/.HomeController.updateDepartment(i.getId)),format.raw/*82.78*/("""" class="button-xs btn-danger">
                        <span class="glyphicon-pencil"></span>
                    </a>
                </td>


                <!-- Button to delete an existing project -->
                <td>
                    <a href=""""),_display_(/*90.31*/routes/*90.37*/.HomeController.deleteDepartment(i.getId)),format.raw/*90.78*/("""" class="button-xs btn-danger">
                        <span class="glyphicon glyphicon-trash"></span>
                    </a>
                </td>
                """)))}),format.raw/*94.18*/("""

                """),format.raw/*96.17*/("""<p>
                    <a href=""""),_display_(/*97.31*/routes/*97.37*/.HomeController.addDepartment()),format.raw/*97.68*/("""">
                        <button class="btn btn-primary">Add a Department</button>
                    </a>
                </p>
                </tr>
        </tbody>
        """)))}),format.raw/*103.10*/("""
    """)))}))
      }
    }
  }

  def render(plist:List[models.Project],alist:List[models.Address],dlist:List[models.Department],emps:models.users.Employees): play.twirl.api.HtmlFormat.Appendable = apply(plist,alist,dlist,emps)

  def f:((List[models.Project],List[models.Address],List[models.Department],models.users.Employees) => play.twirl.api.HtmlFormat.Appendable) = (plist,alist,dlist,emps) => apply(plist,alist,dlist,emps)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 21:04:02 GMT 2019
                  SOURCE: /home/wdd/SDevProj/SDev_CA1/app/views/databaseTest.scala.html
                  HASH: 794ffcf7d23c577f95fa4483020c3fdbf412f4a1
                  MATRIX: 1037->1|1251->123|1281->145|1320->147|1349->172|1376->174|1416->206|1455->208|1482->209|1547->249|1560->254|1595->269|1622->270|1660->278|1690->281|2121->685|2150->698|2190->700|2219->701|2268->723|2278->724|2305->730|2355->753|2365->754|2394->762|2444->785|2454->786|2488->799|2538->822|2548->823|2580->834|2630->857|2640->858|2675->872|2721->891|2766->927|2805->928|2846->941|2962->1030|2977->1036|3036->1074|3304->1315|3319->1321|3378->1359|3579->1529|3621->1540|3659->1551|3704->1587|3743->1588|3784->1601|3890->1680|3905->1686|3954->1714|4110->1839|4142->1844|4184->1860|4229->1896|4268->1897|4300->1902|4574->2149|4603->2162|4643->2164|4672->2165|4725->2191|4735->2192|4762->2198|4816->2225|4826->2226|4855->2234|4940->2292|4955->2298|5017->2339|5301->2596|5316->2602|5378->2643|5577->2811|5623->2829|5684->2863|5699->2869|5751->2900|5962->3079
                  LINES: 28->1|34->3|34->3|34->3|36->5|37->6|37->6|37->6|38->7|39->8|39->8|39->8|40->9|41->10|44->13|60->29|60->29|60->29|60->29|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|66->35|66->35|66->35|67->36|69->38|69->38|69->38|77->46|77->46|77->46|82->51|83->52|85->54|85->54|85->54|86->55|88->57|88->57|88->57|92->61|93->62|96->65|96->65|96->65|97->66|108->77|108->77|108->77|108->77|109->78|109->78|109->78|110->79|110->79|110->79|113->82|113->82|113->82|121->90|121->90|121->90|125->94|127->96|128->97|128->97|128->97|134->103
                  -- GENERATED --
              */
          