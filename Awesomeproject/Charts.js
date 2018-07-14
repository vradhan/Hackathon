import React, {Component} from 'react'
import {TouchableHighlight, StyleSheet, Text, View, Image} from 'react-native'


export default class Chart extends Component {
    static navigationOptions = ({ navigation }) => {
        return {
            title: `Welcome User`,
        }
    };
    render() {
        const {state, navigate} = this.props.navigation;
        return (<View style={styles.container}>
            <Image source={require('./images.jpg')} />
            <Text style={styles.titleText}>Machine Efficieny Monitoring</Text>
            <View style={styles.buttonContainer}>
                <TouchableHighlight
                    onPress={() => this.props.navigation.goBack()}
                    style={[styles.button, {backgroundColor: '#C56EE0'}]}>
                    <Text style={styles.buttonText}>Go Back</Text>
                </TouchableHighlight>

                <TouchableHighlight
                    onPress={() => navigate("MachineOutputToday", {screen: "MachineOutputToday"})}
                    style={[styles.button, {backgroundColor: '#8E84FB'}]}>
                    <Text style={styles.buttonText}>Output today</Text>
                </TouchableHighlight>
                <TouchableHighlight
                    onPress={() => navigate("MachineOutputPast", {screen: "MachineOutputPast"})}
                    style={[styles.button, {backgroundColor: '#8E84FB'}]}>
                    <Text style={styles.buttonText}>Output past</Text>
                </TouchableHighlight>
                <TouchableHighlight
                    onPress={() => navigate("StackedChart", {screen: "StackedChart"})}
                    style={[styles.button, {backgroundColor: '#8E84FB'}]}>
                    <Text style={styles.buttonText}>Comparison charts</Text>
                </TouchableHighlight>
            </View>
        </View>)
    }
    };
    const styles = StyleSheet.create({
        container: {
            flex: 1,
            justifyContent: 'center',
            alignItems: 'center'
        },
        titleText: {
            fontSize: 22
        },
        buttonContainer: {
            flexDirection: 'row',
            marginLeft: 20,
            marginRight: 20,
            marginTop: 20
        },
        button: {
            borderRadius: 20,
            height: 50,
            flex: 2,
            margin: 10,
            justifyContent: 'center'
        },
        buttonText: {
            color: 'white',
            alignSelf: 'center',
            fontSize: 18
        }
    });