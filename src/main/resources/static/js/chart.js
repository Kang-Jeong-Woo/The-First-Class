$(function() {
  /* ChartJS
   * -------
   * Data and config for chartjs
   */
  var options = {
    scales: {
      yAxes: [{
        ticks: {
          beginAtZero: true
        }
      }]
    },
    legend: {
      display: false
    },
    elements: {
      point: {
        radius: 0
      }
    }

  };
  var doughnutPieData = {
    datasets: [{
      data: [30, 40, 30],
      backgroundColor: [
        'rgba(255, 99, 132, 0.5)',
        'rgba(54, 162, 235, 0.5)',
        'rgba(255, 206, 86, 0.5)',
        'rgba(75, 192, 192, 0.5)',
        'rgba(153, 102, 255, 0.5)',
        'rgba(255, 159, 64, 0.5)'
      ],
      borderColor: [
        'rgba(255,99,132,1)',
        'rgba(54, 162, 235, 1)',
        'rgba(255, 206, 86, 1)',
        'rgba(75, 192, 192, 1)',
        'rgba(153, 102, 255, 1)',
        'rgba(255, 159, 64, 1)'
      ],
    }],

    // These labels appear in the legend and in the tooltips when hovering different arcs
    labels: [
      'Pink',
      'Blue',
      'Yellow',
    ]
  };
  var doughnutPieOptions = {
    responsive: true,
    animation: {
      animateScale: true,
      animateRotate: true
    }
  };
  var areaData = {
    labels: ["2013", "2014", "2015", "2016", "2017"],
    datasets: [{
      label: '# of Votes',
      data: [12, 19, 3, 5, 2, 3],
      backgroundColor: [
        'rgba(255, 99, 132, 0.2)',
        'rgba(54, 162, 235, 0.2)',
        'rgba(255, 206, 86, 0.2)',
        'rgba(75, 192, 192, 0.2)',
        'rgba(153, 102, 255, 0.2)',
        'rgba(255, 159, 64, 0.2)'
      ],
      borderColor: [
        'rgba(255,99,132,1)',
        'rgba(54, 162, 235, 1)',
        'rgba(255, 206, 86, 1)',
        'rgba(75, 192, 192, 1)',
        'rgba(153, 102, 255, 1)',
        'rgba(255, 159, 64, 1)'
      ],
      borderWidth: 1,
      fill: true, // 3: no fill
    }]
  };

				  var areaOptions = {
				    plugins: {
				      filler: {
				        propagate: true
				      }
				    }
				  }
				  
				  function localchoice(){
				  // 행정구/행정동 선택 박스
					$('document').ready(function() {
       				 var area0 = ["행정구 선택","광산구", "남구", "동구", "북구", "서구"];
       				  var area1 = ["도산동", "도천동", "비아동", "산월동", "산정동", "선암동", "소촌동", "송정동", 
       				        "수완동", "신가동", "신창동", "신촌동", "쌍암동", "우산동", "운남동", "운수동", "월계동", "월곡동",
       				        "장덕동", "하남동", "흑석동"];
       				   var area2 = ["노대동", "방림동", "백운동", "봉선동", "사동", "서동", "송하동", "압촌동", "양림동",
       				        "월산동", "임암동", "주월동", "지석동", "진월동", "행암동"];
       				   var area3 = ["계림동", "금남로2가", "금남로5가", "동명동", "산수동", "선교동", "소태동", "수기동", "용산동",
       				        "운림동", "월남동", "장동", "지산동", "충장로4가", "학동"];
       				   var area4 = ["각화동", "동림동", "두암동", "매곡동", "문흥동", "본촌동", "삼각동", "신안동", "신용동",
       				        "양산동", "연제동", "오치동", "용두동", "용봉동", "우산동", "운암동", "유동", "일곡동",
       				        "임동", "중흥동", "풍향동"];
       				   var area5 = ["광천동", "금호동", "내방동", "농성동", "동천동", "마륵동", "매월동", "쌍촌동", "양동",
       				        "유촌동", "치평동", "풍암동", "화정동"];
       				 		 

       				 // 행정구 선택 박스 초기화
       				 $("select[name^=sido]").each(function() {
       				  $selsido = $(this);
       				  $.each(eval(area0), function() {
       				   $selsido.append("<option value='"+this+"'>"+this+"</option>");
       				  });
       				  $selsido.next().append("<option value=''>행정동 선택</option>");
       				 });

       				 // 행정구 선택시 행정동 설정
       				 $("select[name^=sido]").change(function() {
       				  var area = "area"+$("option",$(this)).index($("option:selected",$(this))); // 선택지역의 행정동 Array
       				  var $gugun = $(this).next(); // 선택영역 행정동 객체
       				  $("option",$gugun).remove(); // 행정동 초기화

       				  if(area == "area0")
       				   $gugun.append("<option value=''>행정동 선택</option>");
       				  else {
       				   $.each(eval(area), function() {
       				    $gugun.append("<option onclick='chartview("+this+")' value='"+this+"'>"+this+"</option>");
       				   });
       				  }
       				 })
       				});              
  				};
  		
  function LineData(){
	  const lmin8 = 234;
	  const lmax8 = 456;
	  let pm8 = Math.floor(Math.random() * (lmax8-lmin8)) + lmin8;	
	  console.log(pm8)
		    	
	  const lmin10 = 801;
	  const lmax10 = 999;
	  let pm10 = Math.floor(Math.random() * (lmax10-lmin10)) + lmin10;	
	  console.log(pm10)
			    	
	  const lmin12 = 2482;
	  const lmax12 = 2954;
	  let pm12 = Math.floor(Math.random() * (lmax12-lmin12)) + lmin12;	
	  console.log(pm12)
			    	
	  const lmin14 = 1081;
	  const lmax14 = 1625;
	  let pm14 = Math.floor(Math.random() * (lmax14-lmin14)) + lmin14;	
	  console.log(pm14)
			    	
	  const lmin16 = 1325;
	  const lmax16 = 1988;
	  let pm16 = Math.floor(Math.random() * (lmax16-lmin16)) + lmin16;	
	  console.log(pm16)
				    
	  const lmin18 = 1659;
	  const lmax18 = 2000;
	  let pm18 = Math.floor(Math.random() * (lmax18-lmin18)) + lmin18;	
	  console.log(pm18)
			    	
	  const lmin20 = 2104;
	  const lmax20 = 2424;
	  let pm20 = Math.floor(Math.random() * (lmax20-lmin20)) + lmin20;	
	  console.log(pm20)
				    
	  const lmin22 = 999;
	  const lmax22 = 1324;
	  let pm22 = Math.floor(Math.random() * (lmax22-lmin22)) + lmin22;	
	  console.log(pm22)
  };
  
  
  function BarData() {
	const bmin1 = 234;
    const bmax1 = 456;
    let bar1 = Math.floor(Math.random() * (bmax1-bmin1)) + bmin1;	
    console.log(bar1)
    
    const bmin2 = 234;
    const bmax2 = 456;
    let bar2 = Math.floor(Math.random() * (bmax2-bmin2)) + bmin2;	
    console.log(bar2)
    
    const bmin3 = 234;
    const bmax3 = 456;
    let bar3 = Math.floor(Math.random() * (bmax3-bmin3)) + bmin3;	
    console.log(bar3)
    
    const bmin4 = 234;
    const bmax4 = 456;
    let bar4 = Math.floor(Math.random() * (bmax4-bmin4)) + bmin4;	
    console.log(bar4)
    
    const bmin5 = 234;
    const bmax5 = 456;
    let bar5 = Math.floor(Math.random() * (bmax5-bmin5)) + bmin5;	
    console.log(bar5)
    
    const bmin6 = 234;
    const bmax6 = 456;
    let bar6 = Math.floor(Math.random() * (bmax6-bmin6)) + bmin6;	
    console.log(bar6)
    
    const bmin7 = 234;
    const bmax7 = 456;
    let bar7 = Math.floor(Math.random() * (bmax7-bmin7)) + bmin7;	
    console.log(bar7)
    
    const bmin8 = 234;
    const bmax8 = 456;
    let bar8 = Math.floor(Math.random() * (bmax8-bmin8)) + bmin8;	
    console.log(bar8)
    
    const bmin9 = 234;
    const bmax9 = 456;
    let bar9 = Math.floor(Math.random() * (bmax9-bmin9)) + bmin9;	
    console.log(bar9)
    
    const bmin10 = 234;
    const bmax10 = 456;
    let bar10 = Math.floor(Math.random() * (bmax10-bmin10)) + bmin10;	
    console.log(bar10)
    
    const bmin11 = 234;
    const bmax11 = 456;
    let bar11 = Math.floor(Math.random() * (bmax11-bmin11)) + bmin11;	
    console.log(bar11)
    
    const bmin12 = 234;
    const bmax12 = 456;
    let bar12 = Math.floor(Math.random() * (bmax12-bmin12)) + bmin12;	
    console.log(bar12)
    
    const bmin13 = 234;
    const bmax13 = 456;
    let bar13 = Math.floor(Math.random() * (bmax13-bmin13)) + bmin13;	
    console.log(bar13)
    
    const bmin14 = 234;
    const bmax14 = 456;
    let bar14 = Math.floor(Math.random() * (bmax14-bmin14)) + bmin14;	
    console.log(bar14)
    
    const bmin15 = 234;
    const bmax15 = 456;
    let bar15 = Math.floor(Math.random() * (bmax15-bmin15)) + bmin15;	
    console.log(bar15)
    
    const bmin16 = 234;
    const bmax16 = 456;
    let bar16 = Math.floor(Math.random() * (bmax16-bmin16)) + bmin16;	
    console.log(bar16)
    
    const bmin17 = 234;
    const bmax17 = 456;
    let bar17 = Math.floor(Math.random() * (bmax17-bmin17)) + bmin17;	
    console.log(bar17)
    
    const bmin18 = 234;
    const bmax18 = 456;
    let bar18 = Math.floor(Math.random() * (bmax18-bmin18)) + bmin18;	
    console.log(bar18)
  };
  
  function MixedData(){
	  
  }

  var multiAreaData = {
    labels: ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"],
    datasets: [{
        label: 'Facebook',
        data: [8, 11, 13, 15, 12, 13, 16, 15, 13, 19, 11, 14],
        borderColor: ['rgba(255, 99, 132, 0.5)'],
        backgroundColor: ['rgba(255, 99, 132, 0.5)'],
        borderWidth: 1,
        fill: true
      },
      {
        label: 'Twitter',
        data: [7, 17, 12, 16, 14, 18, 16, 12, 15, 11, 13, 9],
        borderColor: ['rgba(54, 162, 235, 0.5)'],
        backgroundColor: ['rgba(54, 162, 235, 0.5)'],
        borderWidth: 1,
        fill: true
      },
      {
        label: 'Linkedin',
        data: [6, 14, 16, 20, 12, 18, 15, 12, 17, 19, 15, 11],
        borderColor: ['rgba(255, 206, 86, 0.5)'],
        backgroundColor: ['rgba(255, 206, 86, 0.5)'],
        borderWidth: 1,
        fill: true
      }
    ]
  };

  var multiAreaOptions = {
    plugins: {
      filler: {
        propagate: true
      }
    },
    elements: {
      point: {
        radius: 0
      }
    },
    scales: {
      xAxes: [{
        gridLines: {
          display: false
        }
      }],
      yAxes: [{
        gridLines: {
          display: false
        }
      }]
    }
  }

  var scatterChartData = {
    datasets: [{
        label: 'First Dataset',
        data: [{
            x: -10,
            y: 0
          },
          {
            x: 0,
            y: 3
          },
          {
            x: -25,
            y: 5
          },
          {
            x: 40,
            y: 5
          }
        ],
        backgroundColor: [
          'rgba(255, 99, 132, 0.2)'
        ],
        borderColor: [
          'rgba(255,99,132,1)'
        ],
        borderWidth: 1
      },
      {
        label: 'Second Dataset',
        data: [{
            x: 10,
            y: 5
          },
          {
            x: 20,
            y: -30
          },
          {
            x: -25,
            y: 15
          },
          {
            x: -10,
            y: 5
          }
        ],
        backgroundColor: [
          'rgba(54, 162, 235, 0.2)',
        ],
        borderColor: [
          'rgba(54, 162, 235, 1)',
        ],
        borderWidth: 1
      }
    ]
  }

  var scatterChartOptions = {
    scales: {
      xAxes: [{
        type: 'linear',
        position: 'bottom'
      }]
    }
  }
  // Get context with jQuery - using jQuery's .get() method.
  if ($("#barChart").length) {
    var barChartCanvas = $("#barChart").get(0).getContext("2d");
    // This will get the first returned node in the jQuery collection.
    var barChart = new Chart(barChartCanvas, {
      type: 'bar',
      data: data,
      options: options
    });
  }

  if ($("#lineChart").length) {
    var lineChartCanvas = $("#lineChart").get(0).getContext("2d");
    var lineChart = new Chart(lineChartCanvas, {
      type: 'line',
      data: data,
      options: options
    });
  }

  if ($("#linechart-multi").length) {
    var multiLineCanvas = $("#linechart-multi").get(0).getContext("2d");
    var lineChart = new Chart(multiLineCanvas, {
      type: 'line',
      data: multiLineData,
      options: options
    });
  }

  if ($("#areachart-multi").length) {
    var multiAreaCanvas = $("#areachart-multi").get(0).getContext("2d");
    var multiAreaChart = new Chart(multiAreaCanvas, {
      type: 'line',
      data: multiAreaData,
      options: multiAreaOptions
    });
  }

  if ($("#doughnutChart").length) {
    var doughnutChartCanvas = $("#doughnutChart").get(0).getContext("2d");
    var doughnutChart = new Chart(doughnutChartCanvas, {
      type: 'doughnut',
      data: doughnutPieData,
      options: doughnutPieOptions
    });
  }

  if ($("#pieChart").length) {
    var pieChartCanvas = $("#pieChart").get(0).getContext("2d");
    var pieChart = new Chart(pieChartCanvas, {
      type: 'pie',
      data: doughnutPieData,
      options: doughnutPieOptions
    });
  }

  if ($("#areaChart").length) {
    var areaChartCanvas = $("#areaChart").get(0).getContext("2d");
    var areaChart = new Chart(areaChartCanvas, {
      type: 'line',
      data: areaData,
      options: areaOptions
    });
  }

  if ($("#scatterChart").length) {
    var scatterChartCanvas = $("#scatterChart").get(0).getContext("2d");
    var scatterChart = new Chart(scatterChartCanvas, {
      type: 'scatter',
      data: scatterChartData,
      options: scatterChartOptions
    });
  }

  if ($("#browserTrafficChart").length) {
    var doughnutChartCanvas = $("#browserTrafficChart").get(0).getContext("2d");
    var doughnutChart = new Chart(doughnutChartCanvas, {
      type: 'doughnut',
      data: browserTrafficData,
      options: doughnutPieOptions
    });
  }
});