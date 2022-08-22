window.onload = function () {
                function stopPropagation(e) {
                    if (e.stopPropagation) {
                        e.stopPropagation();
                    } else {
                        e.cancelBubble = false;
                    }
                }
                var btn = document.getElementById("butt");
                var layer = document.getElementById("layer");
                
                btn.onclick = function (e) {
                   
                	
                	
                    layer.style.display = "block";
                    
                    var signin = document.getElementById("signin");
                    var register= document.getElementById("register");

         userstate=document.getElementById("userstate").value;
         if(userstate!="MY Friend"){
        	
         signin.style.visibility="hidden";
         register.style.visibility="hidden";
        
         }
                    
                    
                    
                    stopPropagation(e);   
                }
                window.onclick = function (e) {
                    layer.style.display = "none";
                }
            }
