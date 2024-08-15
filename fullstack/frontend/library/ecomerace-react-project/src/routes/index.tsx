import path from "path";
import { Outlet, useRoutes } from "react-router-dom";
import { Home } from "../pages/Home";
import { Login } from "../pages/Login";

let allpages={
    path:'/',
Element:<><Outlet/></>,
Children:[
{
    path:'home',
    Element:<Home/>
},
{
    path:'login',
    Element:<Login/>
}
]
}




function Allroutes(){
    return useRoutes([allpages])

}
export default Allroutes