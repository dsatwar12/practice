import { Outlet, useRoutes } from "react-router-dom";
import { Home } from "../pages/Home";
import { Login } from "../pages/Login";
import { CustomStyles } from "../components/styles/CustomStyles";

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
    path:'style',
    Element:< CustomStyles/>
}
]
}




function Allroutes(){
    return useRoutes([allpages])

}
export default Allroutes