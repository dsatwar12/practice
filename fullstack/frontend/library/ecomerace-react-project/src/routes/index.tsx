import { Outlet, useRoutes } from "react-router-dom";
import { Home } from "../pages/Home";
import { Login } from "../pages/Login";
import { CustomStyles } from "../components/styles/CustomStyles";
import { UseStateHook } from "../hooks/UseStateHook";
import { UseEffectHook } from "../hooks/UseEffectHook";
import { Register } from "../pages/Register";
import { NotesContainer } from "../components/Notes/NotesContainer";

let allpages={
    path:'/',
Element:<><Outlet/></>,
Children:[
{
    path:'/home',
    Element:<Home/>
},
{
    path:'login',
    Element:<Login/>
},
{
    path:'register',
    Element:<Register/>
},
{
    path:'style',
    Element:< CustomStyles/>
},
{
    path:'hooks',
    Element:<>
     <UseStateHook/>
     <UseEffectHook/>
    </>
},
{
    path:'notes',
    Element:<NotesContainer/>
},

]
}




function Allroutes(){
    return useRoutes([allpages])

}
export default Allroutes