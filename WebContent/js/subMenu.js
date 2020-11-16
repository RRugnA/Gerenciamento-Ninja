const btNinja = document.querySelector("#ninja");
const btMission = document.querySelector("#mission");

let eventNinja = false;
let eventMission = false;

const menuNinja = "#submenu1";
const menuMission = "#submenu2";

eventNinja = subMenu(btNinja, eventNinja, menuNinja);
eventMission = subMenu(btMission, eventMission, menuMission);

function subMenu(btn, idEvent, menuName){
  btn.addEventListener("click", function(event){
    event.preventDefault();

    if (!idEvent){  
      console.log(menuName);  
      const subMenu = document.querySelector(menuName);
      subMenu.classList.remove("invisivel"); 
      subMenu.classList.add("visivel");          
      idEvent = true;
      return idEvent;
    } else {
      const subMenu = document.querySelector(menuName);
      subMenu.classList.remove("visivel"); 
      subMenu.classList.add("invisivel");  
      idEvent = false;
      return idEvent;
    } 
  })
}
