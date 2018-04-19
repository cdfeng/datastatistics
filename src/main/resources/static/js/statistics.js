$(document).ready(function(){
    (function(){
        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('main'));
        // 指定图表的配置项和数据
        var chartOption={
            title: {
                textStyle:{
                    color:'#428bca'
                }
            },
            tooltip: {},
            toolbox:{
                show : true,
                feature : {
                    mark : {show: true},
                    dataView : {show: true, readOnly: false},
                    magicType : {show: true, type: ['line', 'bar']},
                    restore : {show: true},
                    saveAsImage : {show: true},
                    myToolDay: {
                        show: true,
                        title: '按日',
                        icon: 'path://M 65 703 c -60 -139 -75 -384 -36 -572 c 11 -51 22 -96 26 -99 c 3 -3 21 2 40 11 c 46 22 53 22 117 -8 c 105 -49 235 -25 271 50 c 45 94 49 358 8 452 c -42 94 -147 165 -265 179 c -57 7 -59 6 -54 -14 c 8 -29 0 -28 -50 9 l -41 30 l -16 -38 Z m 194 -109 c 82 -22 114 -52 136 -128 c 25 -85 21 -90 -79 -81 c -46 3 -108 12 -137 19 l -54 12 l 1 64 c 1 42 10 86 25 125 c 22 58 23 59 33 34 c 7 -22 21 -30 75 -45 Z m 24 -301 c 90 -4 120 -9 124 -20 c 3 -8 0 -39 -6 -69 c -23 -101 -91 -111 -213 -30 c -26 17 -26 17 -33 -5 c -11 -34 -23 -5 -31 76 l -7 68 l 24 -7 c 13 -4 77 -10 142 -13 Z',
                        onclick: function (){
                            getStatisticsByDay();
                        }
                    },
                    myToolMonth: {
                        show: true,
                        title: '按月',
                        icon: 'path://M 52 723 l -40 -49 l 43 -45 c 79 -84 108 -254 82 -480 l -7 -66 l 51 -22 c 53 -22 69 -20 69 6 c 0 12 6 12 35 -6 c 89 -52 224 -67 283 -31 c 56 34 65 70 70 296 c 5 216 -4 303 -40 386 c -11 27 -23 48 -26 48 c -4 0 -90 -47 -100 -55 c -2 -2 6 -21 17 -43 c 21 -42 47 -169 37 -180 c -9 -9 -171 14 -231 32 c -49 15 -51 17 -88 99 c -23 50 -54 100 -76 121 l -38 37 l -41 -48 Z m 288 -314 c 25 -6 77 -14 115 -18 l 70 -6 l 3 -47 c 3 -41 0 -48 -15 -48 c -33 0 -147 20 -200 36 l -53 15 l 0 45 c 0 38 3 45 18 40 c 9 -3 37 -10 62 -17 Z m 77 -196 c 112 -20 125 -31 82 -74 c -26 -26 -68 -21 -153 21 c -55 26 -61 27 -73 12 c -11 -15 -12 -11 -13 27 c 0 42 1 43 28 37 c 15 -3 73 -14 129 -23 Z',
                        onclick: function (){
                            getStatisticsByMonth();
                        }
                    },
                    myToolYear: {
                        show: true,
                        title: '按年',
                        icon: 'path://M 422 747 c -41 -8 -51 -13 -48 -26 c 6 -20 26 -141 26 -159 c 0 -10 -12 -12 -47 -7 c -56 8 -277 53 -297 61 c -9 4 -19 -10 -30 -42 c -9 -26 -16 -49 -16 -50 c 0 -1 17 -5 38 -8 c 20 -4 53 -11 73 -17 c 35 -9 35 -9 30 -51 c -7 -49 3 -156 16 -169 c 10 -10 83 6 92 20 c 6 10 105 -9 119 -23 c 3 -3 0 -23 -6 -45 l -12 -38 l -86 17 c -79 16 -90 22 -133 64 l -47 46 l -39 -40 l -40 -41 l 56 -49 c 42 -37 64 -66 85 -114 l 28 -64 l 55 5 c 31 3 57 7 59 8 c 1 1 -5 19 -13 40 c -9 20 -14 39 -12 42 c 3 2 54 -3 113 -11 c 60 -8 157 -18 217 -22 l 107 -7 l 0 29 c 0 74 -1 74 -121 74 c -60 0 -109 3 -109 6 c 0 4 5 24 12 46 c 10 34 14 38 37 34 c 14 -3 50 -8 80 -12 l 54 -6 l -7 42 c -9 58 -11 60 -59 60 c -78 0 -88 7 -85 54 l 3 41 l 128 -2 l 128 -3 l -7 48 c -3 26 -8 50 -11 55 c -2 4 -57 7 -122 7 l -118 0 l -7 88 c -8 95 -15 133 -25 131 c -3 -1 -30 -6 -59 -12 Z m -39 -293 c 12 -4 17 -16 17 -46 l 0 -40 l -32 7 c -18 4 -43 9 -54 12 c -18 4 -24 -2 -34 -32 c -9 -27 -15 -34 -21 -24 c -10 16 -12 84 -3 117 c 6 22 10 23 58 17 c 28 -4 59 -9 69 -11 Z',
                        onclick: function (){
                            getStatisticsByYear();
                        }
                    }
                }
            },
            legend: {
                data:[]
            },
            xAxis: {
                data:[]
            },
            yAxis: {},
            series: [{}]
        };
        getStatisticsByDay();


        function getStatisticsByDay(){
            $.get("/statisticsByDay",function(data,status){
                if((status!="success")){
                    console.log("加载数据失败!");
                    return;
                }
                myChart.dispatchAction({
                    type: 'restore'
                });
                chartOption.title.text='按天统计数据';
                chartOption.legend.data=['增量'];
                chartOption.xAxis.data=[];
                chartOption.series[0].name='增量';
                chartOption.series[0].type='bar';
                chartOption.series[0].data=[];

                $(data).each(function(i,elem){
                    var name= elem.year+'/'+elem.month+'/'+elem.day;
                    chartOption.xAxis.data.push(name);
                    chartOption.series[0].data.push(elem.count);
                });

                myChart.setOption(chartOption);
            });
        }

        function getStatisticsByMonth(){
            $.get("/statisticsByMonth",function(data,status){
                if((status!="success")){
                    console.log("加载数据失败!");
                    return;
                }
                myChart.dispatchAction({
                    type: 'restore'
                });
                chartOption.title.text='按月统计数据';
                chartOption.legend.data=['增量'];
                chartOption.xAxis.data=[];
                chartOption.series[0].name='增量';
                chartOption.series[0].type='bar';
                chartOption.series[0].data=[];

                $(data).each(function(i,elem){
                    var name= elem.year+'/'+elem.month;
                    chartOption.xAxis.data.push(name);
                    chartOption.series[0].data.push(elem.count);
                });

                myChart.setOption(chartOption);
            });
        }

        function getStatisticsByYear(){
            $.get("/statisticsByYear",function(data,status){
                if((status!="success")){
                    console.log("加载数据失败!");
                    return;
                }
                myChart.dispatchAction({
                    type: 'restore'
                });
                chartOption.title.text='按年统计数据';
                chartOption.legend.data=['增量'];
                chartOption.xAxis.data=[];
                chartOption.series[0].name='增量';
                chartOption.series[0].type='bar';
                chartOption.series[0].data=[];

                $(data).each(function(i,elem){
                    var name= elem.year;
                    chartOption.xAxis.data.push(name);
                    chartOption.series[0].data.push(elem.count);
                });

                myChart.setOption(chartOption);
            });
        }
    })();
});