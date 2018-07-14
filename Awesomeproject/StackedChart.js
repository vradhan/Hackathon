import React, {Component} from 'react'
import {TouchableHighlight, StyleSheet, Text, View,Image} from 'react-native'


export default class StackedChart extends Component {
    static navigationOptions = ({ navigation }) => {
        return {
            title: `Welcome ${navigation.state.params.screen}`,
        }
    };
    render() {

        const { state, navigate } = this.props.navigation;
        return (<View style={styles.container}>
                <Text style={styles.titleText}>{state.params.screen}</Text>
                <Image source={require('./download3.png')} />
                <View style={styles.buttonContainer}>
                    <TouchableHighlight
                        onPress={() => this.props.navigation.goBack()}
                        style={[styles.button, {backgroundColor: '#C56EE0'}]}>
                        <Text style={styles.buttonText}>Go Back</Text>
                    </TouchableHighlight>

                    <TouchableHighlight
                        onPress={() => navigate("StackedChartReport", { screen: "StackedChartReport" })}
                        style={[styles.button, {backgroundColor: '#8E84FB'}]}>
                        <Text style={styles.buttonText}>Bar Chart</Text>
                    </TouchableHighlight>
                    <TouchableHighlight
                        onPress={() => navigate("StackedAreaChartReport", { screen: "StackedAreaChartReport" })}
                        style={[styles.button, {backgroundColor: '#8E84FB'}]}>
                        <Text style={styles.buttonText}>Area Chart</Text>
                    </TouchableHighlight>
                    <TouchableHighlight
                        onPress={() => navigate("XAxisChartReport", { screen: "XAxisChartReport" })}
                        style={[styles.button, {backgroundColor: '#8E84FB'}]}>
                        <Text style={styles.buttonText}>XAxis Chart</Text>
                    </TouchableHighlight>
                </View>
            </View>
        )
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