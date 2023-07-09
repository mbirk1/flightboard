import "../styles/label.css";
export default function Label(props: any) {
    const {text, style_type}= props;
    return(
        <label className={style_type}>{text}</label>
    );
}