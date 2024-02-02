 document.addEventListener("DOMContentLoaded", function() {
		    
		        var typeDropdown = document.getElementById("typeDropdown");
		        var yearDropdown = document.getElementById("yearDropdown");
		        var monthDropdown = document.getElementById("monthDropdown");

				// Get the current year
				var currentYear = new Date().getFullYear();
				// Populate the dropdown with years from 2005 to the current year
				for (var year = 2005; year <= currentYear; year++) {
				        var option = document.createElement("option");
				        option.value = year;
				        option.text = year;
				        yearDropdown.add(option);
				}
		        

		            $("#typeDropdown, #yearDropdown, #monthDropdown").change(function () {
		            	debugger;
		                if ($("#typeDropdown").val() === "cformRequest") {
		                    var month = $("#monthDropdown").val();
		                    var year = $("#yearDropdown").val();

		                    console.log("years");

		                    $.ajax({
		                        type: "GET",
		                        url: "/Index/getCountForCform",
		                        data: {
		                            month: month,
		                            year: year
		                        },
		                        success: function (count) {
		                            // Display the count in the UI
		                            var vatRcCountElement = document.getElementById("vatRcCount");
		                            vatRcCountElement.innerHTML = "Number of cform request:" + count;

		                            // Show the card when the condition is met
		                            $("#cformCard").show();
		                            $("#dealerCard").hide();
		                            
		                        },
		                        error: function (error) {
		                            console.error("Error fetching count:", error);
		                        }
		                    });
		                }
		                else if ($("#typeDropdown").val() === "dealer") {
		                	var month = $("#monthDropdown").val();
		                    var year = $("#yearDropdown").val();

		                    console.log("years");
		                    
		                    $.ajax({
		                        type: "GET",
		                        url: "/Index/getCountForDealer",
		                        data: {
		                            month: month,
		                            year: year
		                        },
		                        success: function (count) {
		                            // Display the count in the UI
		                            var dealerCountElement = document.getElementById("dealerCount");
		                            dealerCountElement.innerHTML = count;
		                            
		                            $("#CountcurrentMonth").hide();
		                            $("#dealerCard").show();
		                            $("#cformCard").show();
		                            $("#countvatCancelledByMonth").hide();
		                        },
		                        error: function (error) {
		                            console.error("Error fetching count:", error);
		                        }
		                    });
		                    
		                } else {
		                    // If the condition is not met, hide the card
		                    $("#cformCard").hide();
		                    $("#dealerCard").hide();
		                }
		            });
		    });