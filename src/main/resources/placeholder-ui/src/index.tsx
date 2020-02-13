import * as React from 'react';
import axios from 'axios';
import { render } from 'react-dom';

const template = (placeholder: string) =>
    <div className="columns is-centered">
        <div className="column is-7">
            <br/>
            <hr/>
            <h3 className="title is-3">{ placeholder }</h3>
        </div>
    </div>;

class App extends React.Component {
    state = {
        placeholder: 'fetching...'
    };

    componentDidMount(): void {
        axios
            .get('placeholders/1')
            .then(res => this.setState({ placeholder: res.data.value }))
    }

    render() {
        return template(this.state.placeholder);
    }
}

render(<App/>, document.getElementById('root'));
