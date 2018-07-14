import React from 'react'


import HomeScreen from './HomeScreen'
import StackedChart from './StackedChart'
import MachineOutputToday from './MachineOutputToday'
import {createStackNavigator} from 'react-navigation';
import StackedChartReport from "./StackedChartReport";
import Chart from "./Charts";
import StackedAreaChartReport from "./StackedAreaChartReport";
import XAxisChartReport from "./XAxisChartReport";
import MachineOutputPast from "./MachineOutputPast";

const App = createStackNavigator({
    Home: { screen: HomeScreen },
    StackedChart: { screen: StackedChart },
    MachineOutputToday: {screen: MachineOutputToday},
    StackedChartReport: {screen: StackedChartReport},
    Chart: {screen: Chart},
    XAxisChartReport: {screen: XAxisChartReport},
    StackedAreaChartReport: {screen: StackedAreaChartReport},
    MachineOutputPast: {screen: MachineOutputPast}

});

export default App;

