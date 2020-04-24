$(document).ready(function() {
	
	$.ajax({
	
		url: "https://api.github.com/users"
		
	}).then(function(data) {
		
		console.log(data);
		var table = $("#usersTable");
		var contents = "";
		$.each(data, function(idx) {
			
			contents +=  "<tr>";
			contents += "<td><button>" + data[idx].login + "</button></td>";
			contents += "<td> <img src='" + data[idx].avatar_url + "' width=50 height=50 style='display:none'; /></td>";
			contents += "</tr>";
		})
		
		console.log(contents);
		table.append(contents);
		
	});
	
});