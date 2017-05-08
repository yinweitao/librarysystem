
//$(document).ready(){
//	
//}
//简写
$(function(){
	debugger;
//	function foo(){
//		var a  =2;
//		function bar(){
//			console.log(a);
//		}
//		//return bar;
//	}
//	ii
//	var baz=foo();
//	baz();
	
	
//	function foo(){
//		var a=2;
//		function baz(){
//			conlose.log(a);
//		}
//		bar(baz);
//	}
//	
//	function bar(fn){
//		fn();
//	}
	
//	for(var i=1;i<=5;i++){
//		(function() {
//			setTimeout(function timer(){
//				console.log(i);
//			},i*1000);
//		})();
//	}
	
//	  //比较函数
//	        function createComparison(propertyName) {
//	
//	            return function (obj1, obj2) {
//	                var item1 = obj1[propertyName];
//	                var item2 = obj2[propertyName];
//	
//	                if (item1 < item2)
//	                    return -1;
//	
//	                if (item1 > item2)
//	                    return 1;
//	
//	                if (item1 == item2)
//	                    return 0;
//	            }
//	        }
//	
//	        //比较name
//	        var compare = createComparison("name");
//	
//	        var result = compare({ name: "d", age: 20 }, { name: "c", age: 27 });
	
    var arr = new Array();
    
    function Person() {
        for (var i = 0; i < 10; i++) {

            //要记住，这个属性函数申明，只有立即执行才会取scope属性
            var item = function () {
                return i;
            };

            arr.push(item);
        }
    }

    Person();

    for (var i = 0; i < arr.length; i++) {
        console.log(arr[i]());
    }
	
})