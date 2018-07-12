import React, {Component} from 'react'
import {Scene, Router, Actions} from 'react-native-router-flux'
import {StyleSheet, Text, View} from 'react-native'

import StackedChart from './StackedChart'

const RouterComponent = () => {
    return (
        <Router sceneStyle={{ paddingTop:55 }}>
            <Scene key={StackedChart} component={StackedChart} title={StackedChart} />
            <Scene key={MachineOutputToday} component={MachineOutputToday} title={MachineOutputToday}/>
        </Router>
    );

};

export default RouterComponent