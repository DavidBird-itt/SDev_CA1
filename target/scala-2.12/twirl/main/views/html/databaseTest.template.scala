
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
            """)))}),format.raw/*51.14*/("""

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

            """),_display_(/*77.14*/for(i<-alist) yield /*77.27*/ {_display_(Seq[Any](format.raw/*77.29*/(""" """),format.raw/*77.30*/("""<tr>
                <td>"""),_display_(/*78.22*/i/*78.23*/.getStreet1),format.raw/*78.34*/("""</td>
                <td>"""),_display_(/*79.22*/i/*79.23*/.getStreet2),format.raw/*79.34*/("""</td>
                <td>"""),_display_(/*80.22*/i/*80.23*/.getTown),format.raw/*80.31*/("""</td>
                <td>"""),_display_(/*81.22*/i/*81.23*/.getEircode),format.raw/*81.34*/("""</td>

                </tr>
                """)))}),format.raw/*84.18*/("""

                """),format.raw/*86.17*/("""<table class="table table-bordered table-hover table-condensed">
                    <thead>
                        <h2>Department Table</h2>
                        <tr>
                            <th> ID </th>
                            <th> Name </th>
                        </tr>
                    </thead>

                    <tbody>

                        """),_display_(/*97.26*/for(i<-dlist) yield /*97.39*/ {_display_(Seq[Any](format.raw/*97.41*/(""" """),format.raw/*97.42*/("""<tr>
                            <td>"""),_display_(/*98.34*/i/*98.35*/.getId),format.raw/*98.41*/("""</td>
                            <td>"""),_display_(/*99.34*/i/*99.35*/.getName),format.raw/*99.43*/("""</td>

                            </tr>


                            <td>
                                <a href=""""),_display_(/*105.43*/routes/*105.49*/.HomeController.updateDepartment(i.getId)),format.raw/*105.90*/("""" class="button-xs btn-danger">
                                    <span class="glyphicon-pencil"></span>
                                </a>
                            </td>


                            <!-- Button to delete an existing project -->
                            <td>
                                <a href=""""),_display_(/*113.43*/routes/*113.49*/.HomeController.deleteDepartment(i.getId)),format.raw/*113.90*/("""" class="button-xs btn-danger">
                                    <span class="glyphicon glyphicon-trash"></span>
                                </a>
                            </td>
                            """)))}),format.raw/*117.30*/("""

                            """),format.raw/*119.29*/("""<p>
                                <a href=""""),_display_(/*120.43*/routes/*120.49*/.HomeController.addDepartment()),format.raw/*120.80*/("""">
                                    <button class="btn btn-primary">Add a Department</button>
                                </a>
                            </p>
                    </tbody>
        </tbody>
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
                  DATE: Mon Mar 18 19:19:03 GMT 2019
                  SOURCE: /home/wdd/Desktop/SDev_CA1/app/views/databaseTest.scala.html
                  HASH: fa851b2ca8ee549e708c4cc3a4b4305845e3cb6c
                  MATRIX: 1037->1|1251->123|1281->145|1320->147|1349->172|1376->174|1416->206|1455->208|1482->209|1547->249|1560->254|1595->269|1622->270|1660->278|1690->281|2126->690|2155->703|2195->705|2224->706|2273->728|2283->729|2310->735|2360->758|2370->759|2399->767|2449->790|2459->791|2493->804|2543->827|2553->828|2585->839|2635->862|2645->863|2680->877|2815->985|2830->991|2889->1029|3149->1262|3164->1268|3223->1306|3424->1476|3466->1490|3572->1569|3587->1575|3636->1603|4226->2166|4255->2179|4295->2181|4324->2182|4377->2208|4387->2209|4419->2220|4473->2247|4483->2248|4515->2259|4569->2286|4579->2287|4608->2295|4662->2322|4672->2323|4704->2334|4781->2380|4827->2398|5226->2770|5255->2783|5295->2785|5324->2786|5389->2824|5399->2825|5426->2831|5492->2870|5502->2871|5531->2879|5677->2997|5693->3003|5756->3044|6113->3373|6129->3379|6192->3420|6440->3636|6499->3666|6573->3712|6589->3718|6642->3749
                  LINES: 28->1|34->3|34->3|34->3|36->5|37->6|37->6|37->6|38->7|39->8|39->8|39->8|40->9|41->10|44->13|60->29|60->29|60->29|60->29|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|69->38|69->38|69->38|77->46|77->46|77->46|82->51|84->53|86->55|86->55|86->55|108->77|108->77|108->77|108->77|109->78|109->78|109->78|110->79|110->79|110->79|111->80|111->80|111->80|112->81|112->81|112->81|115->84|117->86|128->97|128->97|128->97|128->97|129->98|129->98|129->98|130->99|130->99|130->99|136->105|136->105|136->105|144->113|144->113|144->113|148->117|150->119|151->120|151->120|151->120
                  -- GENERATED --
              */
          